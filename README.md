# File Content Reverser

## Overview

The File Content Reverser is a Java application designed to read the contents of an ASCII input file, reverse the contents, and write the reversed contents to an output file. The application is built using Java 17 and follows Test-Driven Development (TDD) principles. The project does not use any build tools like Maven or Gradle.

## Project Structure

- **`Main` Class**: The entry point of the application that handles command-line arguments and orchestrates file reading, content reversal, and file writing.
- **`FileContentReverser` Class**: Contains the core logic for reversing the content of the file.
- **`FileOperations` Class**: Handles file operations such as reading from and writing to files.
- **Tests**: Unit tests for `FileContentReverser` and `FileOperations`, ensuring core functionality and file operations work as expected.

## Setup

### Prerequisites

- Java 17 JDK
- JUnit 5 (JUnit Jupiter API and Engine)

### Running the Application

1. **Compile the Code**: Use the following command to compile the Java files:
    ```bash
    javac -d out src/com/example/*.java
    ```

2. **Run the Application**: Execute the application with the required command-line arguments for input and output file paths:
    ```bash
    java -cp out com.example.Main <inputFilePath> <outputFilePath>
    ```

### Example

To reverse the contents of a file `input.txt` and write the reversed contents to `output.txt`, use:
```bash
java -cp out com.example.Main input.txt output.txt


## Testing

### Unit Tests with JUnit 5

Unit tests are provided for the core logic (`FileContentReverser`) and file operations (`FileOperations`). These tests are written using JUnit 5 and can be run using the JUnit Platform Console Launcher.

**To run tests:**

1. **Compile the Source and Test Files**: Compile both the source and test files into the `out` directory. Make sure to include the JUnit 5 and JUnit Platform dependencies in the classpath.
    ```bash
    javac -d out -cp "path/to/junit-platform-console-standalone.jar" src/com/example/*.java src/test/java/com/example/*.java
    ```

2. **Run the Tests**: Use the JUnit Platform Console Launcher to execute the tests.
    ```bash
    java -cp "out;path/to/junit-platform-console-standalone.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
    ```



