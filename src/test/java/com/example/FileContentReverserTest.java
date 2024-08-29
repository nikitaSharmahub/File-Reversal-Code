package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}