package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a/span")
	private WebElement Summary ;
	
	@FindBy (id = "cgv")
	private WebElement Agree ;
	
	@FindBy(xpath = "//form[@id='form']/p/button/span")
	private WebElement Shipping ;
	
	public Summary(WebDriver driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getSummary() {
    	return Summary;
	}
    	
    public WebElement getAgree() {
    	return Agree ;
    }
    
    public WebElement getShipping() {
    	return Shipping ;
    }
    
}


