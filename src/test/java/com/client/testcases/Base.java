package com.client.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.client.utilities.ReadConfiguration;


public class Base {
	public WebDriver driver;
	ReadConfiguration  Readconfigdata;
	
	@BeforeMethod
	public void Setup() throws InterruptedException, IOException 
	{
	Readconfigdata=new ReadConfiguration();
	String url= Readconfigdata.getUrl();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}

	@AfterMethod
	public void Closewind()
	{
	driver.quit();
	}
}

