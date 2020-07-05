package com.github.horitaku1124.kotlin.sql_minus_driver

import java.lang.RuntimeException
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverManager
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.logging.Logger


class SqlMinusDriver: Driver {
  companion object {
    init {
      println("com.github.horitaku1124.kotlin.sql_minus_driver.SqlMinusDriver.load")
      var driver = SqlMinusDriver()
      DriverManager.registerDriver(driver)
    }
  }

  override fun connect(url: String?, info: Properties?): Connection {
    println("connect to $url")
    val parts = url!!.split(":")
    if (parts[0] != "sql_minus") {
      throw RuntimeException()
    }
    val host = parts[1]
    val port = parts[2].toInt()
    return SqlMinusConnection(host, port)
  }

  override fun getMinorVersion(): Int {
    TODO("Not yet implemented")
  }

  override fun getParentLogger(): Logger {
    TODO("Not yet implemented")
  }

  override fun getPropertyInfo(url: String?, info: Properties?): Array<DriverPropertyInfo> {
    TODO("Not yet implemented")
  }

  override fun jdbcCompliant(): Boolean {
    TODO("Not yet implemented")
  }

  override fun acceptsURL(url: String?): Boolean {
    TODO("Not yet implemented")
  }

  override fun getMajorVersion(): Int {
    TODO("Not yet implemented")
  }
}