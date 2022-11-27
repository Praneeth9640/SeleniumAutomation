package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data.properties");
		Properties p = new Properties();
		p.load(fis);
		p.put("url1","https://www.google.co.in/");
		FileOutputStream fos = new FileOutputStream("./data.properties");
		p.store(fos,"Data updated successfully");
	}

}
