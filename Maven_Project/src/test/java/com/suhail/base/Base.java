package com.suhail.base;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.suhail.reports.ExtentManager;

public class Base {
public ExtentReports rep;
public ExtentTest test;
public String testName;
public SoftAssert softAssert=null;
	
	@BeforeTest
	public void init() {
		
		
		
		
	}
	
	@BeforeMethod
	public void initTest(Method method) {
		
		//Method method;
		
	testName=method.getName();
		
	rep=ExtentManager.getInstance(System.getProperty("user.dir")+"\\Extent Reports\\");
	
	test=rep.createTest(testName);
		
		
		
	}
	
	@AfterTest
	public void end() {
		
		if(softAssert!=null)
			softAssert.assertAll();
		
	}
}
