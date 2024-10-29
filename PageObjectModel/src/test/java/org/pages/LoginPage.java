package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	  public WebElement username(WebDriver driver) { 
		  return
	  driver.findElement(By.id("username")); }
	  
	  public WebElement password(WebDriver driver) { 
		  return
	  driver.findElement(By.id("password")); }
	  
	  public WebElement loginButton(WebDriver driver) { 
		  return
	  driver.findElement(By.id("login")); }
	 
	
	/*
	 * @FindBy(id="username") public static WebElement username;
	 * 
	 * @FindBy(id="password") public static WebElement password;
	 * 
	 * @FindBy(id="login") public static WebElement loginButton;
	 */
}
