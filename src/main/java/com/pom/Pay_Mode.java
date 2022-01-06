package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_Mode {
	
public WebDriver driver;
	
	@FindBy(xpath ="//div[@id='center_column']/form/p/button/span")
	private WebElement Pay_Mode ;
	
    public Pay_Mode (WebDriver  driver2) {
		
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
		
	}
    public WebElement getPay_Mode() {
 	   return Pay_Mode;

 }
 }



