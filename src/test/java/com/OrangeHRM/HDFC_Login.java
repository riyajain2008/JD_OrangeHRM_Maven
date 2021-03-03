package com.OrangeHRM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HDFC_Login {

	@Test
	public void Login_successfuly_scenario() throws InterruptedException {
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(10000);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1000");
		driver.findElement(By.xpath("driver.findElement(By.name(\"fldLoginUserId\")).sendKeys(\"1000\");")).click();
		String ActURL=driver.getCurrentUrl();
        String ExpURL="https://netbanking.hdfcbank.com/netbanking/";
        Assert.assertEquals(ExpURL, ActURL);
		
		//driver.close();//closes the current browser
		driver.quit();//closes all the browsers opened by selenium
		
	}

}
