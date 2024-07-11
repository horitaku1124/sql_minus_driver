# sql_minus_driver


### Generate Protos

```bash
SRC_DIR=./protobuf
DST_DIR=./src/main/java
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/exec_query.proto
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/exec_result.proto
```

Generate lib .jar file
```
./gradlew clean shadowJar
```