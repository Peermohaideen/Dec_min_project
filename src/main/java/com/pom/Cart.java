package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	private WebDriver driver;
	
	@FindBy(xpath ="//iframe[@vspace='0']")
	private WebElement Cart ;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement Cart1;
	
	@FindBy(xpath="//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
	private WebElement Proceed;

	
	
	 public Cart(WebDriver driver2) {
			
			this.driver = driver2;
			
			PageFactory.initElements(driver, this);
		}
	 
	 public WebElement getCart() {
		  return Cart;
	  }
	 public WebElement getCart1() {
		  return Cart1;
	  }
	 public WebElement getProceed() {
		  return Proceed;
	 }
	 }
	
	  