package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Libglobal {
	public static WebDriver gh;
	public WebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();
		gh = new ChromeDriver();
		gh.manage().window().maximize();
		return gh;
	}
	public void loadurl(String url) {
		gh.get(url);
	}
	public void insertText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void clickButton(WebElement element) {
		element.click();
	}
}
