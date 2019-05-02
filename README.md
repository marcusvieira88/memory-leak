# Introduction

This is a Java memory leak example, it is used as example in my blog (https://marcusvieira.tech) tutorials.

## For check default JVM configuration:

Linux / MacOs
```
java -XX:+PrintFlagsFinal -version | grep HeapSize
```
Windows
```
java -XX:+PrintFlagsFinal -version | findstr HeapSize
```

## For configure the min and max heap memory size:

Min size
```
–Xms32M
```
Max size
```
–Xmx64M
```

## For set a different garbage collector:
```
–XX:+UseSerialGC
–XX:+UseParallelGC
–XX:+UseParallelOldGC
–XX:+UseConcMarkSweepGC
```
