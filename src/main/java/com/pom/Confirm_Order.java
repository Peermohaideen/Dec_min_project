package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {
	
public WebDriver driver;
	
	@FindBy(xpath ="//div[@id='center_column']/form/p/button/span")
	private WebElement Confirm_Order ;
	
    public Confirm_Order (WebDriver  driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		
	}
    public WebElement getOrder() {
 	   return Confirm_Order;

 }
 }


