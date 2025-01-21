package com.client.testcases;

import org.testng.annotations.Test;

import com.client.pages.LoginpageObjects;

public class Loginpagetest extends Base

{
	LoginpageObjects loginpage;
	@Test(priority=1)
	public void Tc001_Login_valid() throws InterruptedException
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithvalidcred("mngr604490","yjuhEny");

	}
	@Test(priority=2)
	public void Tc002_Login_Invalid() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithInvalidcred("mngr6044901","yjuhEnyu");

	}

	@Test(priority=3)
	public void Tc003_Login_Invalid() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithvaliduserinvalidpwd("mngr604490","yjuhEnyu");

	}
	@Test(priority=4)
	public void Tc004_Login_Invalid() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithinvaliduservalidpwd("mngr6044901","yjuhEny");

	}
	@Test(priority=5)
	public void Tc005_Login_withoutcred() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithoutcredential();

	}

	@Test(priority=6)
	public void Tc006_Login_withvalidenter() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithvalidcred("mngr604490","yjuhEny");

	}
	@Test(priority=7)
	public void Tc007_Login_withInvalidenter() throws InterruptedException 
	{
		loginpage=	new LoginpageObjects(driver);
		loginpage.loginwithinvalidcredenter("mngr6044901","yjuhEnyu");

	}
}