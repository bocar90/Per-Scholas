package practice_SBA_303_14;

public class AddTwoNumbersTest {

	public static void main(String[] args) {
		/* 5. Create a functional interface called  AddTwoNumbers  with a method called add. 
		 * The datatype for the method is of type Integer and the parameters are two ints. 
		 * Use lambdas expressions to add the two values together. */
		AddTwoNumbers numbers = (a,b) -> a + b;
		System.out.println(numbers.add(2, 3));
		
		// 5. Change your lambda expression to subtract the two numbers instead of adding them.
		AddTwoNumbers dif = (a,b) -> a - b;
		System.out.println(dif.add(3, 2));

	}

}
