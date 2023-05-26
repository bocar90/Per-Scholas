package practice_SBA_303_14;

import java.util.ArrayList;
import java.util.Collections;

public class LamdaPrint {
	/*1.Use three different forms of a  lambda expression in the ArrayList's forEach() method to print every item in the list:
		parameter -> expression
		(parameter) -> expression
		(parameter) ->{ expression} */
	
	public static void printUsingLambda(){
		   ArrayList<String> names = new ArrayList<>();

		   String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};

		   Collections.addAll(names, firstName);

		// Print every item in the list using lambda expressions using form: parameter -> expression
		   names.forEach(element1 -> System.out.println(element1));
		   System.out.println("-------------------------------------------");
		// Print every item in the list using lambda expressions using form: (parameter) -> expression
		   names.forEach((element2) -> System.out.println(element2));
		   System.out.println("-------------------------------------------");
		// Print every item in the list using lambda expressions using form: (parameter) -> {expression}
		   names.forEach((element3) -> {System.out.println(element3);});
		   System.out.println("-------------------------------------------");
		
		 //3. Using any of the three different forms of a  lambda expression list above print every item in the list with their index.
		//Hint you can use the index.of method from Class ArrayList.
		   names.forEach(ele -> System.out.println(names.indexOf(ele) + " " + ele));
		   System.out.println("-------------------------------------------");
		   
		 //4.  Using any of the three different forms of a  lambda expression list above print every item in the list 
		 //in capital letters.
		   names.forEach(ele -> System.out.println(ele.toUpperCase()));

		}

	
	public static void main(String[] args) {
		printUsingLambda();

	}

}
