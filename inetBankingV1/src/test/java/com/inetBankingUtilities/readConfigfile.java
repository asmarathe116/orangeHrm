package com.inetBankingUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfigfile {
	Properties prop;
	public String readPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./Congiguration/config.properties");
		 prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public String getApplicationUrl()
	{   
		String url = prop.getProperty("baseUrl");
		return url;	
	}
	
	public String getApplicationUsername()
	{
		String username = prop.getProperty("username");
		return username;	
	}
	
	public String getApplicationPassword()
	{
		String password = prop.getProperty("password");
		return password;	
	}
	
	public String getBrowser()
	{
		String chrome = prop.getProperty("chromepath");
		return chrome;	    
	}
	
	

	
}