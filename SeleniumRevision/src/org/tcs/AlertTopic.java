package org.tcs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTopic {
@SuppressWarnings("deprecation")
public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--incognito");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
	/*
	 * WebElement alert1 =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//button[@id='alertButton']"))); alert1.click();
	 */
	WebElement alert2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='timerAlertButton']")));
	alert2.click();
	Thread.sleep(6000);
	Alert a = driver.switchTo().alert();
	a.accept();
}
}
