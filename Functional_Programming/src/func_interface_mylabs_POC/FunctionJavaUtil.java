package func_interface_mylabs_POC;

//https://www.geeksforgeeks.org/function-interface-in-java-with-examples/

//Importing interface
import java.util.function.Function;

public class FunctionJavaUtil {

	// Java Program to Illustrate Functional Interface
    // Via apply() method
    // Main driver method
	public static void main(String[] args) {
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Integer> mult = a -> a * 2;
		Function<Double, Double> half = a -> a/2.0;
		Function<String, String> str = s -> s + " + test";
		Double dbIInput = 58.5;
		Integer bb = 100;
		String strIn = "Hello";
		//Applying the function to get the result
		Double dd = half.apply(dbIInput);
		Integer ee = mult.apply(bb);
		String result = str.apply(strIn);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(result);
		
	}
}

