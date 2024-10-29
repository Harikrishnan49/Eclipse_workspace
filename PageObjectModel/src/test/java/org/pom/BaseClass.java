package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pages.LoginPage;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		
		  LoginPage lp = new LoginPage(); 
		  lp.username(driver).sendKeys("TomHanks");
		  lp.password(driver).sendKeys("TomHanks"); 
		  lp.loginButton(driver).click();
		 	

			/*
			 * LoginPage.username.sendKeys("TomHanks");
			 * LoginPage.password.sendKeys("TomHanks"); LoginPage.loginButton.click();
			 */
	}
}
