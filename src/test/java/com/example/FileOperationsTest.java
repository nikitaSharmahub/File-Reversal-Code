package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOperationsTest {

    private Path tempFile;

    @BeforeEach
    public void setUp() throws IOException {
        tempFile = Files.createTempFile("test", ".txt");
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    public void testReadFile() throws IOException {
        String content = "Test content";
        Files.writeString(tempFile, content);
        
        FileOperations fileOps = new FileOperations();
        String readContent = fileOps.readFile(tempFile);
        
        assertEquals(content, readContent);
    }

    @Test
    public void testWriteFile() throws IOException {
        String content = "New content";
        
        FileOperations fileOps = new FileOperations();
        fileOps.writeFile(tempFile, content);
        
        String readContent = Files.readString(tempFile);
        assertEquals(content, readContent);
    }
}
