package com.javapoint;

import static org.mockito.Mockito.*;

import java.util.Calendar;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String args[]) {

		//mocking calendar object
		Calendar mockedCalendar = mock(Calendar.class);
		when(mockedCalendar.get(Calendar.YEAR)).thenReturn(2020);

		System.out.println(mockedCalendar.get(Calendar.YEAR));

		//mocking list object
		List myMockedList = mock(List.class);
		when(myMockedList.get(0)).thenReturn("target");
		System.out.println(myMockedList.get(0));

		//--------------------mocking list to accept any argument-----------------
		
		when(myMockedList.get(anyInt())).thenReturn(5);
		when(myMockedList.isEmpty()).thenReturn(false);
		System.out.println(myMockedList.get(1));
		System.out.println(myMockedList.get(2));
		System.out.println(myMockedList.isEmpty());

		//------------------stub method for sequential calls--------------------
		
        //when(myMockedList.get(0)).thenReturn("target").thenReturn("others");  
        when(myMockedList.get(0)).thenReturn("target", "others", "more");  
          
        System.out.println(myMockedList.get(0));  
        System.out.println(myMockedList.get(0));  
        System.out.println(myMockedList.get(0));  
        
        
        //-------------------stub method to throw exception ----------------
        
        //when(myMockedList.get(0)).thenThrow(new NullPointerException());
        //System.out.println(myMockedList.get(0));  
        
        
        //doThrow(new RuntimeException()).when(myMockedList).clear();  
        //myMockedList.clear();
        
        //verify stubbed method to check the method is called or not
        
        myMockedList.clear();
        myMockedList.get(0);
        
        verify(myMockedList,times(5)).get(0);
        verify(myMockedList).clear();
        verify(myMockedList,atLeast(2)).get(0);
        verify(myMockedList,atMost(1)).clear();
        
	}
}


/*****************************OUTPUT*******************

2020
target
5
5
false
target
others
more


******************************************************/