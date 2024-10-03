package org.second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\Second\\driver\\chromedriver.exe");
	WebDriver gh = new ChromeDriver();
	gh.manage().window().maximize();
	gh.get("https://etowndev01.powerappsportals.com/");
}
}
