package com.javapoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {

	String message = "Gopal";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(expected=ArithmeticException.class)
	public void printTestMessagewithException() {
		messageUtil.printMessage(0);
	}
	
	@Test
	public void printTestMessage() {
		assertEquals(message,messageUtil.printMessage(1));
	}
	
	   
}
