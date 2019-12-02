package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestNG_1 {

	@Test
	public void testing1() {

		System.out.println("Test Case One with Thread ID: " + Thread.currentThread().getId());

	}

	@Test
	public void testing2() {

		System.out.println("Test Case Two with Thread ID: " + Thread.currentThread().getId());
		
	}
	@Test
	public void testing3() {

		System.out.println("Test Case One with Thread ID: " + Thread.currentThread().getId());

	}
	@Test
	public void testing4() {

		System.out.println("Test Case One with Thread ID: " + Thread.currentThread().getId());

	}

}
