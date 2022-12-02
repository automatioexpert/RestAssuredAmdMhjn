package unitTest;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import Utilities.PropertiesFileReader;
import java.util.Map;

public class ReaderMap {
	
	@Test
	public void map2() throws IOException {
		
	Map<String,String> data=	PropertiesFileReader.getDataFromPropertiesFile("./src/test/resources/TestData.properties", Arrays.asList("name","company"));
		
		System.out.println(data);
		
		System.out.println(data.get("name"));
	}

}
