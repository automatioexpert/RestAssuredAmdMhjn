package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertiesFileReader {

	public String getDataFromPropertiesFile(String filePath, String key) throws IOException {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(key);
		return value;

	}

	public static Map<String,String> getDataFromPropertiesFile(String filePath, List<String> keys) throws IOException {

		File PropertiesFile = new File(filePath);
		FileInputStream fis = new FileInputStream(PropertiesFile);
		Properties properties = new Properties();
		properties.load(fis);

		Map<String, String> data = new HashMap<>();
		
		for(String key:keys) {
			data.put(key, properties.getProperty(key));
		}
		
		return data;

	}

}
