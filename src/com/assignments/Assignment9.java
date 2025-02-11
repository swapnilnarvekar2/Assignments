package com.assignments;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {12,34,11,36,87,98,93};
		int temp = 0;
		for (int i=0; i<numbers.length; i++) {
			
			for(int j = i+1; j<numbers.length; j++) {
				
				if(numbers[i] <  numbers[j]) {
				temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				}
			}
			
		}

		System.out.println("Second largest number is :" + numbers[1]);
		System.out.println("Third largest number is :" + numbers[2]);
		
	}
		
		

	}

