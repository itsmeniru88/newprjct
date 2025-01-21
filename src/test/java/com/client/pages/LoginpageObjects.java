package com.client.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageObjects {

	//create a constructor with same name & initialise driver
	//we will write all xpaths of the objects here using findBy Annotation
	//create methods to the objects pass uname,pwd&click
	//create testcases methods & call username,pwd&click method
	WebDriver ldriver;
	public LoginpageObjects(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
@FindBy(xpath="//input[@name='uid']") WebElement username;
//sameas above Webelement username=driver.findElement(By.xpath());
@FindBy(xpath="//input[@name='password']") WebElement password;
@FindBy(xpath="//input[@name='btnLogin']") WebElement login;

public void enterUsername(String uname) throws InterruptedException 
{
	Thread.sleep(3000);
	username.sendKeys(uname);

}
public void enterPassword(String pwd) throws InterruptedException 
{
	Thread.sleep(3000);
	password.sendKeys(pwd);
}
public void loginclick() throws InterruptedException
{
	Thread.sleep(3000);
	login.click();

}
public void HitEnter() throws InterruptedException 
{
	Thread.sleep(3000);
	password.sendKeys(Keys.ENTER);
	}

//testcase scenarios methods
public void loginwithvalidcred(String uname,String pwd) throws InterruptedException //1
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	loginclick();
	
}
public void loginwithInvalidcred(String uname,String pwd) throws InterruptedException//2
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	loginclick();
	
}
public void loginwithvaliduserinvalidpwd(String uname,String pwd) throws InterruptedException //3
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	loginclick();
	}
public void loginwithinvaliduservalidpwd(String uname,String pwd) throws InterruptedException //4
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	loginclick();	
}
public void loginwithoutcredential() throws InterruptedException //5
{
	
	loginclick();	
}


public void loginwithvalidcredenter(String uname,String pwd) throws InterruptedException //6
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	HitEnter();

}
public void loginwithinvalidcredenter(String uname,String pwd) throws InterruptedException //7
{
	enterUsername(uname);
	Thread.sleep(3000);
	enterPassword(pwd);
	HitEnter();
}
}

