  package com.inetBankingTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetBankingUtilities.readConfigfile;


public class BaseClass {   

	readConfigfile rc=new readConfigfile();

	public String baseUrl=rc.getApplicationUrl();
	public String username=rc.getApplicationUsername();
	public String password=rc.getApplicationPassword();
	public static WebDriver driver;  
      
	


	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",rc.getBrowser());
		driver=new  ChromeDriver();  

	}

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


}
