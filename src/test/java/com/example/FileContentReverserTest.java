package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

class FileContentReverserTest {

    @Test
    void testReverseContents() {
        // Arrange
        String input = "ABC";
        String expectedOutput = "CBA";        
        
        FileContentReverser reverser = new FileContentReverser();
        
        // Act
        String actualOutput = reverser.reverseContents(input);
        
        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithEmptyInput() {
        // Arrange
        String input = "";
        String expectedOutput = "";      
        
        FileContentReverser reverser = new FileContentReverser();
        
        // Act
        String actualOutput = reverser.reverseContents(input);
        
        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithSingleLine() {
        // Arrange
        String input = "Hello, World!";
        String expectedOutput = "!dlroW ,olleH";   
        
        FileContentReverser reverser = new FileContentReverser();
        
        // Act
        String actualOutput = reverser.reverseContents(input);
        
        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void testReverseContentsWithNewLines() throws IOException {
        // Arrange
        String input = "Line 1\nLine 2";
        String expectedOutput = "2 eniL\n1 eniL";

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithSpecialCharacters() throws IOException {
        // Arrange
        String input = "!@#$$%^&*()";
        String expectedOutput = "()*&^%$$#@!";

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithLargeInput() throws IOException {
        // Arrange
        String input = "A".repeat(10000);
        String expectedOutput = "A".repeat(10000);

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}