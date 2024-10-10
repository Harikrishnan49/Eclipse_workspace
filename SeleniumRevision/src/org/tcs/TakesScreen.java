package org.tcs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harik\\eclipse-workspace\\TakesScreenShot\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("\"https://demoqa.com/alerts\"");
		driver.manage().window().maximize();
		TakesScreenshot sh = (TakesScreenshot) driver;
		File source = sh.getScreenshotAs(OutputType.FILE); 
		File file = new File("C:\\Screenshot.png"); 
		FileHandler.copy(source, file);
	}

}
