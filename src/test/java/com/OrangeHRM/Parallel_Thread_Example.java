package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Thread_Example {
	public WebDriver driver;


	@Test
	public void ChromeTest() throws InterruptedException {

		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		driver.quit();

	}

	@Test
	public void EdgeTest() throws InterruptedException {

		// Initialize the Edge driver
		WebDriverManager.edgedriver().setup();
		System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
		driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(20000);
		driver.quit();

	}

	@Test
	public void IETest() throws InterruptedException {

		// Initialize the IE driver
		WebDriverManager.iedriver().setup();
		System.out.println("The thread ID for IE is " + Thread.currentThread().getId());
		driver = new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(4000);
		driver.quit();

	}

}
