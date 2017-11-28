package com.automation;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

@Test

public class FirstClass {
	
	public void firstTest() {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.close();
		driver.findElement(By.id("lst-ib")).sendKeys("how to automate a website");
		driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > "
		+ "input[type=\"submit\"]:nth-child(1)")).click();
		
	}
	
}