package com.testng_features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Features {
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");

	}
	
	@Test (priority = 0)
	private void women() {
	
		System.out.println("Women");

}

    @Test(priority = -1)
    private void men() {
		
    	System.out.println("Men");
    	
    	

}
    @Test(priority = 1)
    private void kids() {
		
    	System.out.println("Kids");

	}
    
    @AfterMethod
    private void logout() {
    	
    	System.out.println("Logout");
    }

}
