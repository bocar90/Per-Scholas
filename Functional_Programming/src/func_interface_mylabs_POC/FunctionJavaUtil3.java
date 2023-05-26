package func_interface_mylabs_POC;

// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
// Java Program to illustrate compose() method
//Importing Function interface
import java.util.function.Function;
public class FunctionJavaUtil3 {

	public static void main(String[] args) {
		// Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // INSERT CODE TO TRIPLE THE VALUE OF THE HALF FUNCTION 
        //half = half.compose(a -> a * 3);
        half = half.andThen(a -> a * 3);

        // Applying the function to get the result
        System.out.println(half.apply(5));
        
	}
}
