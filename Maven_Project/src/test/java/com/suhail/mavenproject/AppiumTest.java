package com.suhail.mavenproject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.suhail.base.Base;

public class AppiumTest extends Base{

	ExtentReports rep;
	//ExtentTest test;
	
	
	@Test
	public void opennativeapp() {
		
		
		
		System.out.println("opennativeapp");
				softAssert=new SoftAssert();
				test.log(Status.FAIL, "opennativeapp test failed ");
				softAssert.fail();
				softAssert.assertAll();
		
		
		
	}
	
	@Test
	public void closeapp() {
		
		System.out.println("closeapp");
		test.log(Status.INFO, "Test Passed");
		
	}
	
	
}
