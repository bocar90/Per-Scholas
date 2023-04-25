package pa_303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*Task 1: Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
		arrayInt();
		
		/*Task 2: Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} 
		 * and produce the following output: 7 */
		middleElement();
		
		/*Task 3: Write a program that creates an array of String type and initializes it with 
		 * the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. 
		 * Make a copy using the clone( ) method. Use the Arrays.toString( ) method on 
		 * the new array to verify that the original array was copied.*/
		arrayString();
		
		/*Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 *The numbers can be any integers.  Print out the value at the first index and the last 
		 *index using length - 1 as the index. Now try printing the value at 
		 *index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which
		 *is produced. Now try to assign a value to the array index 5. 
		 *You should get the same type of exception.*/
		arrayIndex();
		
		/*Task 5: Write a program where you create an integer array with a length of 5. 
		 *Loop through the array and assign the value of the loop control variable (e.g., i) 
		 *to the corresponding index in the array.*/
		arrayLoopControl();
		
		/*Task 6: Write a program where you create an integer array of 5 numbers. 
		 *Loop through the array and assign the value of the loop control variable 
		 *multiplied by 2 to the corresponding index in the array.*/
		arrayLoopControlMult();
		
		/*Task 7: Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element.*/
		arrayExceptMiddle();
		
		/*Task 8: Write a program that creates a String array of 5 elements and swaps 
		 *the first element with the middle element without creating a new array.*/
		arraySwap();
		
		/*Task 9: Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array. 
		 * The output will look like the following: Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13 */
		arraySort();
		
		/*Task 10: Create an array that includes an integer, 3 strings, and 1 double. 
		 * Print the array.*/
		arrayMultType();
		
		/*Task 11: Write some Java code that asks the user how many favorite things they have. 
		 *Based on their answer, you should create a String array of the correct size. 
		 *Then ask the user to enter the things and store them in the array you created. 
		 *Finally, print out the contents of the array.*/
		arrayFavoriteThings();
	}
	
	private static void arrayInt() {
		System.out.println("**** task 1 ****");
		int []arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int ele: arr)
			System.out.println(ele);
	}
	
	private static void middleElement() {
		System.out.println("**** task 2 ****");
		int []arr = {13, 5, 7, 68, 2};
		int mid = (arr.length/2);
		System.out.println("Middle element: " + arr[mid]);
	}

	private static void arrayString() {
		System.out.println("**** task 3 ****");
		String []array = {"red", "green", "blue","yellow"};
		System.out.println("Length: " + array.length);
		String []arrayCopy = array.clone();
		System.out.println("New array: "+ Arrays.toString(arrayCopy));
		
	}

	private static void arrayIndex() {
		System.out.println("**** task 4 ****");
		int []array = {10, 15, 7, 68, 2};
		System.out.println("First: " + array[0]);
		System.out.println("Last: " + array[array.length-1]);
		//System.out.println(array[array.length]);
		//array[5] = 100;
	}

	private static void arrayLoopControl() {
		System.out.println("**** task 5 ****");
		int []array = new int[5];
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
	}

	private static void arrayLoopControlMult() {
		System.out.println("**** task 6 ****");
		int []array = new int[5];
		for(int i=0; i<array.length; i++) {
			array[i] = i*2;
		}
		System.out.println(Arrays.toString(array));
	}

	private static void arrayExceptMiddle() {
		System.out.println("**** task 7 ****");
		int []array = {5, 24, 74, 9, 1};
		for(int i=0; i<array.length; i++) {
			if(i != array.length/2)
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void arraySwap() {
		System.out.println("**** task 8 ****");
		String []array = {"Bokar", "Fatim","Abdoul", "Coach", "Sally"};
		String temp = array[0];
		array[0] = array[array.length/2];
		array[array.length/2] = temp;
		System.out.println(Arrays.toString(array));	
	}
	
	private static void arraySort() {
		System.out.println("**** task 9 ****");
		int []array = {4, 2, 9, 13, 1, 0};
		Arrays.sort(array);
		System.out.println("Smallest: " + array[0]);
		System.out.println("Largest: " + array[array.length-1]);
	}

	private static void arrayMultType() {
		System.out.println("**** task 10 ****");
		//creates an array of objects
		Object [] obj = new Object[5];
		obj[0] = Integer.valueOf(5);
		obj[1] = "soft";
		obj[2] = "ball";
		obj[3] = "hand";
		obj[4] = Double.valueOf(7.75);
		
		for(Object element: obj) {
			System.out.println(element);
		}		
	}
	
	private static void arrayFavoriteThings() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many favorite things do you have? ");
		int nb = sc.nextInt();
		String []fav = new String[nb];
		for(int i = 0; i < nb; i++) {
			System.out.print("Enter your thing: ");
			fav[i] = sc.next();
		}
		System.out.println("Your favorite  things are:");
		for(String thing: fav) {
			System.out.print(thing + " ");
		}
		sc.close();
	}
}
