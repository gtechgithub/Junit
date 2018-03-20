package com.javapoint;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit2 {

	String message = "Gopal";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSaluationMessage()
	{
	    String messageStr = "Hi" + message;
		assertEquals(messageStr, messageUtil.salutationMessage());
	}
	
	@Ignore
	@Test
	public void testSaluationMessageSuccess()
	{
	    String messageStr = "Hi!" + message;
		assertEquals(messageStr, messageUtil.salutationMessage());
	}
}
