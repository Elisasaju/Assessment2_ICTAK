package com.nest.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.nest.Utilies.PageUtils;
import com.nest.base.Base;

public class HomePage extends Base
{

	
	@FindBy(linkText = "Employee")
	private WebElement employeetab;

	
		@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement Addemp;
	
	@FindBy(xpath="//a[@href='ListEmployee.aspx']")
	private WebElement Listemp;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public void MovetoPage() throws InterruptedException
	{
		
		PageUtils.movetoElement(driver,employeetab);
		
		
		}
	public void AddEmp() throws InterruptedException
	{
		
		PageUtils.Clickele(Addemp);
	}
	
	public void ListEmp() throws InterruptedException
	{
		PageUtils.movetoElement(driver, employeetab);
		PageUtils.Clickele(Listemp);
	}
	

}
