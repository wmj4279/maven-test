package com.wendy.test.maven.test.main;

import com.wendy.test.maven.test.TestJavaEight;

public class MyTest {

	public static void main(String[] args) {
		System.out.println("This is my test class.  Woop woop!!");
		
		TestJavaEight testJavaEight = new TestJavaEight();
		// testJavaEight.testDates();
		// testJavaEight.testStringFunctions();
		testJavaEight.testNewSorting();
	}

}
