package pa_303_4_1;
import java.util.Scanner;

public class CondStatements {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 1- Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. Write an if statement to print out “Less than 10” 
		 * if x is less than 10. Change x to equal 15, and notice the result 
		 * (console should not display anything).
		 */
		ifStatement();
		
		/* 2- Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		 * Write an if-else statement that prints out “Less than 10” if x is less than 10, 
		 * and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
		 */
		ifElseStatement();
		
		/* 3- Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		 * Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
		 * “Between 10 and 20” if x is greater than 10 but less than 20, 
		 * and “Greater than or equal to 20” if x is greater than or equal to 20. 
		 * Change x to 50 and notice the result.
		*/
		ifElseIfStatement();
		
		/* 4- Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		 * Write an if-else statement that prints 
		 * “Out of range”  if the number is less than 10 or greater than 20 and prints  
		 * “In range” if the number is between 10 and 20 (including equal to 10 or 20). 
		 * Change x to 5 and notice the result.
		 */
		OutOfRange();
		
		/* 5- Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
		A: 90-100
		B: 80-89
		C: 70-79
		D: 60-69
		F: <60
		Use the Scanner class to accept a number score from the user to determine the letter grade. 
		Print out “Score out of range” if the score is less than 0 or greater than 100.
		*/
		gradesPrint();
		
		/* 6- Write a program that accepts an integer between 1 and 7 from the user. 
		 *Use a switch statement to print out the corresponding weekday. 
		 *Print “Out of range” if the number is less than 1 or greater than 7. 
		 *Do not forget to include “break” statements in each of your cases.
		 */
		swithStatement();
		
		/* 7- Create a program that lets the users input their filing status and income. 
		 *Display how much tax the user would have to pay according to status and income.*/
		incomeTax();
	}
	
	static void ifStatement() {
		System.out.println("**** Question #1 ****");
		//int x = 7;
		int x = 15;
		if(x < 10)
			System.out.println("Less than 10");
	}
	
	static void ifElseStatement() {
		System.out.println("**** Question #2 ****");
		//int x = 7;
		int x = 15;
		if(x < 10)
			System.out.println("Less than 10");
		else
			System.out.println("Greater than 10");
	}
	
	static void ifElseIfStatement() {
		System.out.println("**** Question #3 ****");
		//int x = 15;
		int x = 50;
		if(x < 10)
			System.out.println("Less than 10");
		else if(x > 10 && x < 20)
			System.out.println("Between 10 and 20");
		else
			System.out.println("Greater than or equal to 20");
	}
	
	static void OutOfRange() {
		System.out.println("**** Question #4 ****");
		//int x = 15;
		int x = 5;
		if(x < 10 || x > 20)
			System.out.println("Out of range");
		else 
			System.out.println("In range");
	}
	
	static void gradesPrint() {
		System.out.println("**** Question #5 ****");		
		System.out.print("Enter a grade (0-100): ");
		int grade = sc.nextInt();		
		if(grade >=90 && grade <=100)
			System.out.println("Your grade is A");
		else if(grade >=80 && grade <=89)
			System.out.println("Your grade is B");
		else if(grade >=70 && grade <=79)
			System.out.println("Your grade is C");
		else if(grade >=60 && grade <=69)
			System.out.println("Your grade is D");
		else
			System.out.println("Your grade is F");

	}

	static void swithStatement() {
		System.out.println("**** Question #6 ****");
		System.out.print("Enter a number (1-7): ");
		int	weekday = sc.nextInt();	
		switch(weekday) {
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			case 7: System.out.println("Sunday");
					break;
			default:
				System.out.println("Out of range");
		}

	}

	static void incomeTax() {
		System.out.println("**** Question #7 ****");
		System.out.print("Enter your filing status: ");
		sc.nextLine();
		String status = sc.nextLine();
		int tax = 0;
		System.out.print("Enter your income: ");
		int income = sc.nextInt();	
		System.out.println("Filing status: " + status);
		System.out.println("Income: " + income);
		if(status.equalsIgnoreCase("single")) {
			if(income <= 8350)
				tax = income * 10/100;
		}else if(status.equalsIgnoreCase("married filing jointly") || status.equalsIgnoreCase("qualifying widow(er)")) {
			
		} else if(status.equalsIgnoreCase("married filing separately")) {
			
		}else if(status.equalsIgnoreCase("head of household")) {
			
		} else
			System.out.println("Status not found!");
			
	}
}
