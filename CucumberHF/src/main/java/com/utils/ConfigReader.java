package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public  Properties init_prop() {
		
		String basePath = System.getProperty("user.dir");
		Path configPath = Paths.get(basePath, File.separator, "src", File.separator, "test", File.separator,
				"resources", File.separator, "config", File.separator, "config.properties");
		
		File file = configPath.toFile();
		
		try {
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to load the config File");
		}
		
		return prop;
		
		
	}

}
