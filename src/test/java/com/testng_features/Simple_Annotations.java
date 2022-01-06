package com.testng_features;

import java.io.Closeable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");

	}
	
	@Test
	
	private void women() {
	
		System.out.println("Women");

}

    @Test
    
    private void men() {
		
    	System.out.println("Men");
    	
    	

}
    @Test
    private void kids() {
		
    	System.out.println("Kids");

	}
    
    @AfterMethod
    private void logout() {
    	
    	System.out.println("Logout");
    }
    
    @AfterClass
    private void verifyHomePage() {
	  
    	System.out.println("verify home page");

	}
    
    @AfterTest
    private void close() {
    	
    	System.out.println("close");
  }
    
    @AfterSuite
    private void deleteAllCookies() {
	
    	System.out.println("Delete All Cookies");

	}
    
    
}  