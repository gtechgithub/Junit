package com.javapoint;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(JunitTestSuiteEx1.class);
		
		for(Failure failure : result.getFailures()	) {
			System.out.println("failure:" + failure.toString());
		}
		
		System.out.println("total testcases ran:" + result.getRunCount());
		System.out.println("total testcases failed:" + result.getFailureCount());
		System.out.println("total testcases Ignored:" + result.getFailureCount());
		
		
	}
}


/*****************************OUTPUT*******************

Gopal
Hi!Gopal
failure:testSaluationMessage(com.javapoint.TestJunit2): expected:<Hi[]Gopal> but was:<Hi[!]Gopal>
total testcases ran:2
total testcases failed:1
total testcases Ignored:1



******************************************************/