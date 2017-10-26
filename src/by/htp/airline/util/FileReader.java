package by.htp.airline.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	public static List<String> readerList(String nameFile) {
		File file = new File(nameFile);
		List<String> aircrafts = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				aircrafts.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return aircrafts;
	}
}
