package com.test;
/**
 * 
 * @author Srinivas
 * Represents sales data for a month
 *
 */

public class SalesData {
	
	int data[] = {0,4,42};
	
	public void display() {
		System.out.println("To be implemeneted");
		int sum = 0;
		for(int i=0; i < data.length; i++){
			System.out.println(data[i]);
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
