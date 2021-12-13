package com.kg.programs;

public class Calculator {

	public int sum(int num1, int num2){
		return num1 + num2;
	}
	
	public int divide(int num1, int num2){
		return num1 - num2;
	}
	
	
	public char getLastChar(String message){
			return message.charAt(message.length() - 1);
}
	public boolean isDivisibleByTwo(int number){
		if(number%2 == 0)
			return true;
		else
			return false;
	}
	
	public int[] reverseArray(int[] arr){
		int [] revArray = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i>=0; i--, j++){
			revArray[j] = arr[i];
		}
		return revArray;
	}
	
	public int getMinimum(int [] numbers){
		int min = 0;

		for(int i=0; i<numbers.length; i++ ){
			if(numbers[i]<min)
				min = numbers[i];
		}
		
		return min;
	}

}
