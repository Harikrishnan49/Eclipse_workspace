package org.tcs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogle {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.navigate().to("https://www.google.co.in/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		//driver.quit();
		//WebElement search = driver.findElement(By.name("q"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		search.click();
		
		 
	}

}
