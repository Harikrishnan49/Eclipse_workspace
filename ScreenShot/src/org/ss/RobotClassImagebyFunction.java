package org.ss;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassImagebyFunction {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\harik\\eclipse-workspace\\ScreenShot\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectagle = new Rectangle(screenSize);
		BufferedImage screenCapture = robot.createScreenCapture(rectagle);
		File file = new File("C:\\Users\\harik\\eclipse-workspace\\ScreenShot\\Image\\image.png");
		ImageIO.write(screenCapture, "png", file);
	}}
