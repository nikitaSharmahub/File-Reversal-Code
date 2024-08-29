package com.example;

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
            lines[i] = new StringBuilder(lines[i]).reverse().toString();
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
}