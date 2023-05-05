package glab_303_11_5;

import java.util.HashSet;

public class Examplethree {

	public static void main(String[] args) {
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet #1: " + primeNumbers);
		
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet #2: " + oddNumbers);
		
		//Difference between HashSet #1 and HashSet #2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference: " + primeNumbers);

	}

}
