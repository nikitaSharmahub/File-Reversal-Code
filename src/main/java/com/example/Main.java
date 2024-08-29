package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 2) {
            System.err.println("Usage: java Main <inputFilePath> <outputFilePath>");
            System.exit(1);
        }

        // Parse the file paths from the arguments
        Path inputFile = Paths.get(args[0]);
        Path outputFile = Paths.get(args[1]);

        // Ensure input file exists
        if (!Files.exists(inputFile)) {
            System.err.println("Input file does not exist: " + inputFile);
            System.exit(1);
        }

        // Create an instance of the FileContentReverser and FileOpertions
        FileContentReverser reverser = new FileContentReverser();
        FileOperations operations = new FileOperations();

        try {
            String content = operations.readFile(inputFile);
            content = reverser.reverseContents(content);
            operations.writeFile(outputFile, content);
            System.out.println("Reversed contents written to: "+outputFile);
        } catch (IOException e) {
            System.err.println("An error occurred while processing the files: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    } 
}