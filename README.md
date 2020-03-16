# Calculator
​
## Description
​
Command line interface calculator that can take user input and prints results.
​
## Environment Setup
​
- Java 11 (OpenJDK)
- Gradle 5.2.1
- JUnit 4
​
## Build Instruction
​
To build this project, run this command
```
./gradlew build
```
​
## Run Test
​
To run test, please run this command
```
./gradlew check
```
​
## Run Instruction
If you want this project to be able to run, please add to build.gradle
```
plugins {
    id 'application'
}

application {
    mainClassName = 'com.bootcamp.[PACKAGE].[MAINCLASS]'
}

```
to run

```
./gradlew run
```

## Constrains
- can parse empty string
- can parse exit command
- can parse cancel command
- can parse add command
