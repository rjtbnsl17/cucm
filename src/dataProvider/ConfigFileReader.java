package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
  // public String driverPath;
	
	Properties properties;
	
	String path = "/Users/rajatbansal/eclipse-workspace/CucumberLearning/configs/Configuation.properties";
	
public ConfigFileReader() throws IOException {
	
	BufferedReader bufferedReader;
	properties = new Properties();
	bufferedReader = new BufferedReader(new FileReader(path));
	
	properties.load(bufferedReader);
	
}
	public String getdriverPath() {
		
		
	//	this.driverPath = path;
		String getdriverpath = properties.getProperty("driverPath");
		return getdriverpath;
				
		
		
	}
	
	public String getExtentReport() {
		
		String getextent = properties.getProperty("ExtentReport");
		return getextent;
		
	}
	
}


