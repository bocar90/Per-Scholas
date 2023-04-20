package com.perscholas.java_basics;

public class OperatorsNumbers {

	public static void main(String[] args) {
		/* 1- Write a program that declares an integer a variable x, assigns the value 2 to it, 
		 * and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
		 * Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
		 * Before printing the results, write a comment with the predicted decimal value and binary string. 
		 * Now, print out x in decimal form and in binary notation.
			Perform the preceding exercise with the following values: 9,17,88
		*/
		int []arrLeft = {2,9,17,88};
		System.out.println("**** Left Shift ****");
		for(int val:arrLeft) {
			binaryStringVersionLeft(val);
		}
		
		/* 2- Write a program that declares a variable x, and assigns 150 to it, 
		 * and prints out the binary string version of the number. 
		 * Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
		 * Write a comment indicating what you anticipate the decimal and binary values to be. 
		 * Now print the value of x and the binary string.
			Perform the preceding exercise with the following values: 225, 1555, 32456
		 */
		int []arrRight = {150,225,1555,32456};
		System.out.println("**** Right Shift ****");
		for(int x:arrRight) {
			binaryStringVersionRight(x);
		}
		
		/* 3- Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. 
		 * Write a comment that indicates what you predict will be the result of the bitwise '&' operation
		 * on x and y. Now use the bitwise '&' operator to derive the decimal and binary values, 
		 * and assign the result to z.
		 */
		bitewiseOperationAnd();
		
		/* 4- Now, with the preceding values, use the bitwise and operator to calculate the “or” 
		 * value between x and y. As before, write a comment that indicates what you predict 
		 * the values to be before printing them out.
		 */
		bitewiseOperationOr();
		
		/* 5- Write a program that declares an integer variable, assigns a number, 
		 * and uses a postfix increment operator to increase the value. 
		 * Print the value before and after the increment operator.
		 */
		postfixIncrement();
		
		/* 6- Write a program that demonstrates at least three ways to increment a variable by 1 
		 * and does this multiple times. Assign a value to an integer variable, print it, 
		 * increment by 1, print it again, increment by 1, and then print it again.
		*/
		threeWayIncrement();
		
		/* 7- Write a program that declares two integer variables: x, and y, and then assigns 5 to x 
		 * and 8 to y. Create another variable sum and assign the value of ++x added to y, 
		 * and print the result. Notice the value of the sum (should be 14). 
		 * Now change the increment operator to postfix (x++) and re-run the program. 
		 * Notice what the value of the sum is. The first configuration incremented x, 
		 * and then calculated the sum, while the second configuration calculated the sum, 
		 * and then incremented x.
		 */
		incrementOperations();
		
	}
	
	static void binaryStringVersionLeft(int l) {	
		System.out.println("binary string version: " + Integer.toBinaryString(l));
		l <<= 1;
		//predicted decimal value = 4; binary string = "100"
		System.out.println(l);
		System.out.println(Integer.toBinaryString(l) + "\n");
	}
	
	static void binaryStringVersionRight(int r) {	
		System.out.println("binary string version: " + Integer.toBinaryString(r));
		r >>= 2;
		//predicted decimal value = 4; binary string = "100"
		System.out.println(r);
		System.out.println(Integer.toBinaryString(r) + "\n");
	}
	
	static void bitewiseOperationAnd() {
		int x, y, z;
		x = 7;
		y = 17;
		// bitwise operation x & y = 00001
		z = x & y;
		System.out.println("**** Bitwise '&' operation ****");
		System.out.println("Decimal value = " + z);
		System.out.println("Binary value = " + Integer.toBinaryString(z));
	}
	
	static void bitewiseOperationOr() {
		int x, y, z;
		x = 7;
		y = 17;
		// bitwise operation x & y = 00001
		z = x | y;
		System.out.println("\n**** Bitwise '|' operation ****");
		System.out.println("Decimal value = " + z);
		System.out.println("Binary value = " + Integer.toBinaryString(z));
	}
	
	static void postfixIncrement() {
		int inc = 4;
		System.out.println("\n**** PostfixIncrement ****");
		System.out.println("Before increment: " + inc);
		inc++;
		System.out.println("Post increment: " + inc);
	}
	
	static void threeWayIncrement() {
		System.out.println("\n**** Ways to Increment ****");
		int inc = 0;
		System.out.println("Initial value: " + inc);
		inc++; //inc=1
		System.out.println("Post increment: " + inc);
		++inc;	//inc=2
		System.out.println("Pre-increment : " + inc);
	}
	
	static void incrementOperations(){
		System.out.println("\n**** Question 7 ****");
		int x = 5, y = 8;
		//int sum = ++x + y; // sum = 14
		int sum = x++ + y;	// sum = 13
		System.out.println("Sum = " + sum);
	}
}
