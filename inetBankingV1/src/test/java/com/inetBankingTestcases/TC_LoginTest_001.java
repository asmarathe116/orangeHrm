package com.inetBankingTestcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		driver.get(baseUrl);


		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLoginBtn();

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}

		else
		{
			Assert.assertTrue(false);
		}
	}


}
