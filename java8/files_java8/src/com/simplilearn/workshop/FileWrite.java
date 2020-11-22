package com.simplilearn.workshop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite {

	public static void main(String[] args) {
		Path path = Paths.get("files", "output.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path)){
			writer.write("welcome to simplilearn!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// write to the file using Files.write()
		String content = "Hello World! Java 8";
		try {
			Files.write(Paths.get("files", "hello.txt"), content.getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
