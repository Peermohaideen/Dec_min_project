package com.testng_features;

import org.testng.annotations.Test;

public class Grouping_Features {
	
	@Test(groups = "Moblie")
	private void apple() {
		
		System.out.println("Apple");

	}
	
	@Test(groups = "Moblie")
	private void samsung() {
		
		System.out.println("Samsung");

	}
	
	@Test(groups = "Music")
	private void spotify() {
		
		System.out.println("Spotify");

	}
	
	@Test(groups = "Music")
	private void wynkMusic() {
		
		System.out.println("wynk music");

	}
	
	@Test(groups = "Books")
	private void books() {
		
		System.out.println("books");
	
	}	

}
	
