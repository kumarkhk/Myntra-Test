package com.myntra.ui.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.myntra.ui.object.AOSHomePage;

public class HomePage {
	
	RemoteWebDriver driver;
	public HomePage(RemoteWebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getShopNowButton()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AOSHomePage.shopNowBtn);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(AOSHomePage.shopNowBtn);
		}
		
		return null;
	}
	
	public WebElement getLoginButton()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AOSHomePage.loginBtn);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(AOSHomePage.loginBtn);
		}
		return null;
	}
	
	public  WebElement getSignUpButton()
	{
		String driverType=driver.getClass().getName();
		
		if(driverType.contains("AndroidDriver"))
		{
			return driver.findElement(AOSHomePage.signUpBtn);
		}
		else if(driverType.contains("IOSDriver"))
		{
			return driver.findElement(AOSHomePage.signUpBtn);
		}
		return null;
		
	}

}
