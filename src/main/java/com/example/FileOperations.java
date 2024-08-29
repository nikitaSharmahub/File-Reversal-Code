package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {

    /**
     * Reads the contents of a file.
     *
     * @param filePath the path to the file
     * @return the file content as a string
     * @throws IOException if an I/O error occurs
     */
    public String readFile(Path filePath) throws IOException {
        return Files.readString(filePath);
    }

    /**
     * Writes the contents to a file.
     *
     * @param filePath the path to the file
     * @param content the content to write
     * @throws IOException if an I/O error occurs
     */
    public void writeFile(Path filePath, String content) throws IOException {
        Files.writeString(filePath, content);
    }
}

