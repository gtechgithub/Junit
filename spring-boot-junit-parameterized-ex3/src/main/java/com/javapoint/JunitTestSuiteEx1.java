package com.javapoint;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JunitTestSuiteEx1 {

	private Integer inputNumber;
	private Boolean expectedResult;
	private MessageUtil messageUtil;

	public JunitTestSuiteEx1(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		messageUtil = new MessageUtil();
	}

	@Parameterized.Parameters
	public static Collection primeNumber() {

		Object[][] object = { { 2, true }, { 3, true }, { 4, false }, { 5, true }, { 19, true }, { 21, false } };

		return Arrays.asList(object);
	}

	@Test
	public void testPrimeNumbersCheck() {
		System.out.println("parameterized number is v1:" + inputNumber);
		assertEquals(expectedResult, messageUtil.findPrimeOrNot(inputNumber));
	}
}
