package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingListSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harik\\git\\repository\\SeleniumRevision\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Food");
		Thread.sleep(5000);
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));   //Here i used 'FindElement"s"' to get all the following elements
		//int position = 0;   //By Using the position need to click the search result
		for (WebElement webElement : list) {
			String text = webElement.getText();   //By default get the search result using List
			System.out.println(text);
			if (text.contains("chain")) {    //By Using the contains keyword to click the search result
				webElement.click();
			}
			//position++;
			/*
			 * if (position==5) { webElement.click(); }
			 */
		}
	}

}
