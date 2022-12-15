package com.nest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nest.Utilies.PageUtils;
import com.nest.base.Base;

public class LoginPage extends Base
{
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnSubmit")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[text()='Invalid UserName']")
	public WebElement invalidLogin;
	
	public LoginPage()
	{
	
		PageFactory.initElements(driver, this);
	}
	public void SetCredentials(String emailid, String pswd) throws Exception
	{
		
		PageUtils.SendInput(username, emailid);
		PageUtils.SendInput(password, pswd);
		PageUtils.Clickele(loginbutton);
	}
	
	
	
}
