package com.example;

public class FileContentReverser {

    /**
     * Reverses the contents read from the provided reader 
     *
     * @param reader the reader to read the contents from
     */
    public String reverseContents(String content){
        return new StringBuilder(content).reverse().toString();
    }
}