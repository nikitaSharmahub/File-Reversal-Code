package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    /**
     * Reverses the contents provided 
     *
     * @param String to get the content
     */
    public String reverseContents(String content){
        // Split the input into lines using newline character as the delimiter
        String[] lines = content.split("\n");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Reverse each line
        for (int i = 0; i < lines.length; i++) {
            // Reverse the characters of the current line
            String reversedLine = reverseWithBracketPreservation(lines[i]);
            lines[i] = new StringBuilder(reversedLine).toString();
        }

        // Reverse the order of lines
        List<String> linesList = Arrays.asList(lines);
        Collections.reverse(linesList);

        // Join the reversed lines back into a single string
        for (String line : linesList) {
            result.append(line).append("\n");
        }

        // Convert the StringBuilder to a String and trim the trailing newline
        return result.toString().trim();
    }

    /**
     * Reverses the characters in the input string while preserving the positions of brackets.
     *
     * @param line the string to reverse, with bracket positions preserved
     * @return the reversed string with brackets in their original positions
     */
    public static String reverseWithBracketPreservation(String line) {
        // Convert the line to a char array for manipulation
        char[] result = line.toCharArray();

        // Use StringBuilder to collect non-bracket characters
        StringBuilder nonBrackets = new StringBuilder();

        // Collect non-bracket characters
        for (char ch : result) {
            if (ch != '(' && ch != ')') {
                nonBrackets.append(ch);               
            }
        }

        // Reverse the collected non-bracket characters
        nonBrackets.reverse();

        // Replace characters in result array while preserving brackets
        int nonBracketIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '(' || result[i] == ')') {
                // Preserve bracket positions
                result[i] = result[i];
            } else {
                // Insert reversed non-bracket characters
                result[i] = nonBrackets.charAt(nonBracketIndex++);
            }
        }

        // Return the final string with brackets preserved in their positions
        return new String(result);
    }

    /**
     *  Reads the contents of the input file and 
     * returns it in form of StringBuilder
     *
     * @param inputFile  the path of the input file
     * @return content read from input file
     * @throws IOException if an I/O error occurs
     */
    public String readFile(Path inputFile) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;

        // Read the entire content
        try (BufferedReader reader = Files.newBufferedReader(inputFile)) {
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        }                        
        return content.toString();
    }

    /**
     * Writes the contents to given outputFile
     *
     * @param outputFile the path of the output file
     * @throws IOException if an I/O error occurs
     */
    public void writeFile(Path outputFile, String content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
                writer.write(content.toString());
        }               
    }

}