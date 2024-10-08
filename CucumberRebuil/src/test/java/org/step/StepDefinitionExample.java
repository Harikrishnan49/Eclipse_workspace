package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionExample {
	WebDriver driver;
	@Given("when user go to the website")
	public void when_user_go_to_the_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@When("I give the data {string} and {string}")
	public void i_give_the_data_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
