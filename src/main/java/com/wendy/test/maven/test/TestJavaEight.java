package com.wendy.test.maven.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestJavaEight {
	
	public void testDates() {
		LocalDateTime now = LocalDateTime.now();

		System.out.println("\nTime Dump:");
		System.out.println("\tMonth:  " + now.getMonthValue());
		System.out.println("\tDay:  " + now.getDayOfMonth());
		System.out.println("\tYear:  " + now.getYear());
		System.out.println("\tHour:  " + now.getHour());
		System.out.println("\tMinute:  " + now.getMinute());
		System.out.println("\tSecond:  " + now.getSecond());
		System.out.println("\tNano:  " + now.getNano());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		System.out.println("\nNow: " + now.format(formatter));

		LocalDateTime plusTwoMonths = now.plusMonths(2);
		System.out.println("Plus Two Months: " + plusTwoMonths.format(formatter));

		LocalDateTime plusThreeYears = now.plusYears(3);
		System.out.println("Plus Three Years: " + plusThreeYears.format(formatter));

		LocalDateTime plusSixtyTwoMinutes = now.plusMinutes(62);
		System.out.println("Plus Sixty Two Minutes: " + plusSixtyTwoMinutes.format(formatter));
	}

	public void testStringFunctions() {

	}

	public void testNewSorting() {

		List<String> names1 = new ArrayList<>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		// Java8Tester tester = new Java8Tester();
		System.out.println("Sort using Java 7 syntax: ");
		//
		sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("Sort using Java 8 syntax: ");
		//
		sortUsingJava8(names2);
		System.out.println(names2);

	}

	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
