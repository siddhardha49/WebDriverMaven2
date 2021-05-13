package com.apps.loginModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("siarikondasiddhu");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("hello");
		System.out.println("it is a check");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
