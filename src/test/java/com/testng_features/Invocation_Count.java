package com.testng_features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority =-1)
	private void apple() {
		
		System.out.println("Apple");

	}
	
	@Test(priority = 0)
	private void samsung() {
		
		System.out.println("Samsung");

	}
	
	@Test(priority =1, invocationCount =3)
	private void redmi() {
		
		System.out.println("Redmi");

	}

}
