package com.arrays;

public class methods {
	
//	Local Scope: A variable declared inside a method or a block of code has local scope. It can only be accessed within that method or block. 
//	Class Scope: A variable declared inside a class but outside a method has class scope. It can be accessed by all methods and blocks of code within the class. 
//	Method Parameter Scope: A variable declared as a parameter of a method has method parameter scope. It can only be accessed within that method. 
//	Static Scope: A variable declared as static has static scope. It can be accessed by all methods and blocks of code within the class and can also be accessed without creating an instance of the class.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method - a way to make a code modular to be able to reuse
		
		String firstName = "Bob";
		String lastName = "Ross"; 
		//storing method inside fullName variable, passing firstName and lastName parameters into method
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		
		int[] myArray = new int [3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		//sum array is the method (instructions, myArray is the parameter to how the method should run (sumArray tells myArray to add up all the numbers inside its array
		System.out.println(sumArray(myArray));
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;

		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 3));
		
	}

	//method for example above
	//public static are access modifiers - use this for all methods for now 
	//String will tell method you are returning a string - not all methods have to return something (use void for those)
	//CANNOT use return if in the Main class of void
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		
		
	}
	
	public static int sumArray (int[] numbers){
		int sum = 0;
		for (int number : numbers) {
			sum+= number;
		}
		return sum;
	}
	
	public static double calculateAverage(double[] numerals) {
		
		double sum = 0;
		for (double numeral : numerals) {
			sum+=numeral;
		}
		return sum / numerals.length;
	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
		
}
