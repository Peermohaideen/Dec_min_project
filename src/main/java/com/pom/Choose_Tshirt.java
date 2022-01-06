package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose_Tshirt {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//img[contains(@title,'Faded')]")
	private WebElement T_shirt;
	
	public Choose_Tshirt(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
  public WebElement getT_shirt() {
	  return T_shirt;

}
}
