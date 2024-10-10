package org.ss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotImage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harik\\eclipse-workspace\\ScreenShot\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		TakesScreenshot sh = (TakesScreenshot) driver; 
		File source = sh.getScreenshotAs(OutputType.FILE); 
		File file = new File("C:\\Users\\harik\\eclipse-workspace\\ScreenShot\\Image\\screenshot910858337363133282.png"); 
		//FileHandler.copy(source, file);   //By using the default option in selenium
		FileUtils.copyFile(source, file);   //By using the commons.io jar file
	}
}