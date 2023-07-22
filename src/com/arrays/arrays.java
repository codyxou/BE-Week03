package com.arrays;

class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
//loop to iterate through array to print each name 
		
		for (int i =0; i< students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for loop below");
		//enhanced for loop
		//For each student in array students - what do I want to do?
		for (String student : students) {
			
			System.out.println(student);
		}
		//short way of writing elements into array
		String[] products = {"Carrots", "Pineapples", "Tomatoes", "Potatoes", "Cereal"};
		
		for (String product : products) {
			System.out.println(product);
		}
		
		//write loop to add values
		int[] multiplesOf3 = new int [10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			//starting at 1 because i is the other factor in products of multiples of 3. Each element will be i * 3. 
			multiplesOf3[i - 1] = i * 3; 
			System.out.println("Number: " + multiplesOf3[i - 1]);
		}
		int[] multiplesOf5 = new int [10];
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i+1) * 5;
			System.out.println(multiplesOf5[i]);
		}
	}
	
}
