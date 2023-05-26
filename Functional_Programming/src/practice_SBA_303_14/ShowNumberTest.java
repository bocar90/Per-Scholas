package practice_SBA_303_14;

public class ShowNumberTest {

	/*6. Create a functional interface called  MyNumber  with a method called showNumber. 
	 * The datatype for the method is of type Integer and the parameter is one int. 
	 * Use lambdas expressions to return the number.*/
	
	public static void main(String[] args) {
		
		MyNumber number  =  (n) -> n;
		//MyNumber number2  =  (m) -> m;

		System.out.println(number.showNumber(11));

	}
}
