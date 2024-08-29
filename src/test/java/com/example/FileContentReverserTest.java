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
    @Test
    void testReverseContentsWithNewLines(){
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
    void testReverseContentsWithSpecialCharacters(){
        // Arrange
        String input = "!@#$$%^&*()";
        String expectedOutput = "*&^%$$#@!()";

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithLargeInput() {
        // Arrange
        String input = "A".repeat(10000);
        String expectedOutput = "A".repeat(10000);

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReverseContentsWithDataInBrackets() {
        // Arrange
        String input = "abc(def)ghi";
        String expectedOutput = "ihg(fed)cba";

        FileContentReverser reverser = new FileContentReverser();

        // Act
        String actualOutput = reverser.reverseContents(input);        

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}