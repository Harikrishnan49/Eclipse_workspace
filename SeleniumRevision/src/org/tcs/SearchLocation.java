package org.tcs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchLocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(co);
	driver.navigate().to("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.quit();
}
}
