package org.tcs;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
@SuppressWarnings("deprecation")
public static void main (String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	//co.addArguments("--incognito");
	co.addArguments("--start-maximized"); //To maximize the window through chromeoptions
	WebDriver driver = new ChromeDriver(co);
	driver.navigate().to("https://www.youtube.com/");
	driver.manage().window().maximize();
	//Dimension dimension = new Dimension(300, 700); //To maximize the window through dimension class
	//driver.manage().window().setSize(dimension);
	//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
	//WebElement search = wait.until(ExpectedConditions.elementToBeClickable((By.id("search"))));
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("Anything Useful");
	search.submit();
	//driver.navigate().refresh();
	//driver.get(driver.getCurrentUrl());
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_F5);
	r.keyRelease(KeyEvent.VK_F5);
	WebElement channel = driver.findElement(By.xpath("//div[@id='info'][@class='style-scope ytd-channel-renderer'][1]"));
	channel.click();
	driver.manage().deleteAllCookies(); //To delete the cookies/caches in site
}
}
