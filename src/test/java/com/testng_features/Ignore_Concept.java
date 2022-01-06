package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	private void apple() {
		
		System.out.println("Apple");

	}
	
	@Test
	private void samsung() {
		
		System.out.println("Samsung");

	}
	
	@Test
	private void redmi() {
		
		System.out.println("Redmi");

	}
	
	@Test(enabled = false)
	private void realme() {
		
		System.out.println("Realme");

	}
	@Ignore
	@Test
	private void oppo() {
		
		System.out.println("Oppo");

	}
    
	@Test
	private void huawei() {
		
		System.out.println("Huawei");

	}

}
