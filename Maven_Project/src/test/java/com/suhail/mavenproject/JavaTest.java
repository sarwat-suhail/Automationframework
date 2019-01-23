package com.suhail.mavenproject;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaTest {
	//private static final String[] "Collectionkey" = null;

	@Parameters("CollectionKey")
	@Test()
	public void Collection_Api(@Optional("Reflection") String CollectionKey) {
		
		System.out.println("Collection_Api with "+CollectionKey);
		
	}
	
	
	
	
}
