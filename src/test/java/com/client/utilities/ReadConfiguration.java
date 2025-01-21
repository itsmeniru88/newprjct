package com.client.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {


public static Properties pro;// properties file read cheyali ante some util called propertiesclass.
	public ReadConfiguration() throws IOException //constructor
	{
		File file= new File("./Configuration/config.properties");//reading the path
		FileInputStream fi= new FileInputStream(file);//Reading the data
		pro=new Properties();
		pro.load(fi);//loading the data in to properties file
	}
		
	//		you can give anymethod name, getUrl for generic purpose
		{
			
			
		}
		public String getUrl() {
			// TODO Auto-generated method stub
			String url1=pro.getProperty("url");
			return url1;
			}
		
		
}