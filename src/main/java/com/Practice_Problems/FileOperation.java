package com.Practice_Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Hello, this is a sample content for the file.";
        writeIntoFile(filePath, content);
        readFile(filePath);
    }

    public static void writeIntoFile(String filePath, String content) {
        FileWriter file;
        // Code to write content into a file at the specified filePath
        try {
             file= new FileWriter(filePath);
            file.write(content);
            file.write(System.lineSeparator());
            file.write("Another line written to the file.");
            System.out.println("Successfully wrote to the file.");
            file.close();
        } catch (IOException io) {
            System.out.println("An error occurred: " + io.getMessage());
        }
    }
    public static void readFile(String file){
        try{
            BufferedReader reader= new BufferedReader(new FileReader(file));
            String line;
            while((line= reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException io){
            System.out.println("An error occurred: " + io.getMessage());
        }
        
    }
}
