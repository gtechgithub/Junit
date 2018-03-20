package com.javapoint;

public class MessageUtil {

	
	//check number is prime or not
	public boolean findPrimeOrNot(int primeNumber) {

		for (int i=2; i < primeNumber; i++) {

			if (primeNumber % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}  	