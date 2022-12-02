package unitTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.PropertiesFileReader;

public class PropertiesReaderTest {

	@Test
	public void readDataFromPropertyFile() throws IOException {

		String str = "\"VV\"";
		System.out.println(str);
		
		String path = "./src/test/resources/TestData.properties";
		PropertiesFileReader propertiesFileReader = new PropertiesFileReader();
		String value = propertiesFileReader.getDataFromPropertiesFile(path, "name");
		System.out.println(value);

		System.out.println(propertiesFileReader.getDataFromPropertiesFile(path, "name1"));
		System.out.println(propertiesFileReader.getDataFromPropertiesFile(path, "company"));

	}

}
