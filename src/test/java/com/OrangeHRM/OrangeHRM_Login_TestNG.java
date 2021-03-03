package com.OrangeHRM;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRM_Login_TestNG {
	
	ChromeDriver driver;
  @Test(priority=1)
  public void Login() {
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin"));
		driver.findElement(By.linkText("Dashboard")).isDisplayed();
	  
	  
  }
  
  @Test
  public void Logout() throws InterruptedException {
	  driver.findElement(By.name("welcome")).click();
	  Thread.sleep(20000);
		
		driver.findElement(By.linkText("Logout")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(200000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
