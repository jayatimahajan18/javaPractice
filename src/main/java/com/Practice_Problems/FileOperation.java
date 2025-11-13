package com.Practice_Problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        FileOperation fileOp= new FileOperation();
        String filePath = "output.txt";
        String content = "Hello, this is a sample content for the file.";
        boolean result = fileOp.writeIntoFile(filePath, content);
        if (result) {
            System.out.println("File writing operation completed successfully.");
        } else {
            System.out.println("File writing operation failed.");
        }
        String readResult = fileOp.readFile(filePath);
        if(readResult!=null){
            System.out.println("File reading operation completed successfully.");
        }
        else if(readResult==null){
            System.out.println("File is empty.");
        }
    }

    public boolean writeIntoFile(String filePath, String content) {
        FileWriter file;
        // Code to write content into a file at the specified filePath
        try {
             file= new FileWriter(filePath);
            file.write(content);
            file.write(System.lineSeparator());
            file.write("Another line written to the file.");
           // System.out.println("Successfully wrote to the file.");
            file.close();
            return true;
        } catch (IOException io) {
            System.out.println("An error occurred: " + io.getMessage());
        }
        return false;
    }
    public String readFile(String file){
        String line;
        String content="";
        try{
            BufferedReader reader= new BufferedReader(new FileReader(file));
            while((line= reader.readLine()) != null){
                content+=line + System.lineSeparator();  // Accumulate lines
            }
            reader.close();
            return content;
        }
        catch(IOException io){
            System.out.println("An error occurred: " + io.getMessage());
        }
        return null;
    }
}
