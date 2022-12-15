package com.nest.Utilies;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PageUtils 
{
	
	public static void SendInput(WebElement ele,String input)
	{
		ele.clear();
		ele.sendKeys(input);
		//ele.getAttribute("value");
	}
	public static void Clickele(WebElement ele) throws InterruptedException
	{
		//WaitUtils.waitforElementToBeClickable( driver, ele);
		//Thread.sleep(2000);
		ele.click();
		
	}
	
	public static String GetText(WebElement ele)
	{
		return ele.getText();	
	}
	
	
	
	public static void MutipleKeys(WebDriver driver,WebElement ele)
	{
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
	}
	public static void clearvalue(WebElement ele) 
	{
		ele.clear();
	}
	public static void movetoElement(WebDriver driver,WebElement ele)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	
		
		
	}
	
	

}
