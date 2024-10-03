package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
public static void main (String[] args) {
	System.setProperty("webdrive.chrome.driver", "C:\\Users\\harik\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	//driver.navigate().to("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
	driver.manage().window().maximize();
	/*
	 * WebElement fashion =
	 * driver.findElement(By.xpath("//span[text()='Fashion']")); Actions action =
	 * new Actions(driver); action.moveToElement(fashion).perform(); WebElement
	 * womenethnic = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
	 * action.moveToElement(womenethnic).perform(); WebElement sarees =
	 * driver.findElement(By.xpath("//a[text()='Women Sarees']"));
	 * action.moveToElement(sarees).perform();
	 */
	/*
	 * WebElement drag = driver.findElement(By.id("dragdiv")); WebElement drop =
	 * driver.findElement(By.id("dropdiv")); Actions a = new Actions(driver);
	 * a.dragAndDrop(drag, drop).perform();
	 */
	WebElement search = driver.findElement(By.name("q"));
	Actions a = new Actions(driver);
	//a.keyDown(search, Keys.SHIFT).sendKeys("Shirt").keyUp(search, Keys.SHIFT).perform();
	a.contextClick(search).perform();
}
}
