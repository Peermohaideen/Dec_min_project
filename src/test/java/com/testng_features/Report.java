package com.testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Report {
	
	@Test(priority = 0)
	private void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

	}
	@Test(priority = 1)
	private void sign_in() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();

	}
	@Test(priority = 2)
	private void T_shirts() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();

	}
	@Test(priority = 3)
	private void womens_dress() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement womens = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions a = new Actions(driver);
	    a.moveToElement(womens).build().perform();
	    driver.findElement(By.xpath("//a[text()='Casual Dresses']")).click();

	}
	@Test(priority = 4)
	private void sign_out() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.close();
	}
	
}


