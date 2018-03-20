package com.javapoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {

	String message = "Gopal";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void printTestMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
	   
}
