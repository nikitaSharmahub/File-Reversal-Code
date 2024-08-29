package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileContentReverserTest {

    @Test
    void testReverseContents() {
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