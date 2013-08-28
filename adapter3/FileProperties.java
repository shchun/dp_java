

import java.io.*;
import java.util.*;

public class FileProperties extends Properties implements FileIO {

	FileProperties() {
	}
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
		System.out.println("loaded: " + filename);
	}
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "written by FileProperties");
	}
	public void setValue(String key, String value) {
		setProperty(key, value);
	}
	public String getValue(String key) {
		String str = new String();
		return str;
	}
}

