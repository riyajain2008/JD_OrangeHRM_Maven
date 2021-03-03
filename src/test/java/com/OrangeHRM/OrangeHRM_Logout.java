package com.OrangeHRM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Logout {
	ChromeDriver driver;
	
	@Before
	public void LaunchBrowser() throws InterruptedException{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@After
	public void closeBrowser(){
		//driver.close();//closes the current browser
				driver.quit();//closes all the browsers opened by selenium
	
	}
	

	@Test
	public void Login_successfuly_scenario() {
		
		//launch browser
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin"));
		driver.findElement(By.linkText("Dashboard")).isDisplayed();
		
		
		
	}

}
