package simplilearn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();

	}

	private static void createFileIn_NIO() throws IOException {
		String data = "Learning Java Is Fun !";
		Files.write(Paths.get("testfile3.txt"), data.getBytes());

		List<String> lines = Arrays.asList("1st line", "2nd line");

		Files.write(Paths.get("testfile4.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);

	}

	private static void createFileUsingFileOutputStreamClass() throws IOException {
		String data = " Welcome to Java Programming! ";
		FileOutputStream output = new FileOutputStream("testfile2.txt");
		output.write(data.getBytes());
		output.close();
	}

	private static void createFileUsingFileClass() throws IOException {
		File file = new File("testfile1.txt");

		// create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
		// file -- node stream
		// writer -- > character stream
		FileWriter writer = new FileWriter(file);
		writer.write("Hello World ! Java Programming");
		writer.close();
	}

}
