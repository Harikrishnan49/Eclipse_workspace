package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user gives the valid data")
	public void user_gives_the_valid_data() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@When("user enter the data")
	public void user_enter_the_data() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user click login button")
	public void user_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user able to view the login page")
	public void user_able_to_view_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
