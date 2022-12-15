package com.nest.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Base
{
	public static Properties properties;
	public static WebDriver driver;
	
	public static WebDriver getDriver() 
	{
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	@BeforeSuite
	public void intilization() throws IOException
	{
		 
		properties= new Properties();
		File file= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
		FileInputStream inputStream= new FileInputStream(file);
		properties.load(new InputStreamReader(inputStream,Charset.forName("UTF-8")));
		
		if(properties.getProperty("browser").equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(properties.getProperty("browser").equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(properties.getProperty("browser").equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		getDriver().get(properties.getProperty("url"));
		driver.manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
