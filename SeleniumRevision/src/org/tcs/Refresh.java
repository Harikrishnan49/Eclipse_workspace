package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Refresh {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(co);
	driver.navigate().to("https://www.google.co.in/");
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Learn Automation Online"+Keys.F5);
	Thread.sleep(2000);
	
}
}
