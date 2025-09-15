package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAPI {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");

        //write string to file
        Files.writeString(path, "Hello Java11\nThis is Files API.");

        //read string from file
        String content = Files.readString(path);
        System.out.println(content);
    }
}
