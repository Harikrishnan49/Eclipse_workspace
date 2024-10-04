package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EtownStepdefinition {
	static WebDriver gh;
	@Given("user open the browser")
	public void user_open_the_browser() {
		WebDriverManager.chromedriver().setup();
	    gh = new ChromeDriver();
	    gh.manage().window().maximize();
	    gh.get("https://etowndev01.powerappsportals.com/");
	}
	@Given("user enter the basic details")
	public void user_enter_the_basic_details() {
	    WebElement button = gh.findElement(By.xpath("//a[@aria-label='Contact us']"));
	    button.click();
	    WebElement name = gh.findElement(By.id("adx_createdbycontact"));
	    name.sendKeys("Harikrishnan");
	    WebElement email = gh.findElement(By.id("adx_contactemail"));
	    email.sendKeys("harikrishnan15me048@gmail.com");
	    WebElement enquiry = gh.findElement(By.id("title"));
	    enquiry.sendKeys("Enquiry");
	}
	
	@Then("user click the submit button.")
	public void user_click_the_submit_button() throws InterruptedException {
		Thread.sleep(6000);
		WebElement click = gh.findElement(By.xpath("//input[@title='Submit']"));
	    click.click();
	    gh.quit();
	}

}
