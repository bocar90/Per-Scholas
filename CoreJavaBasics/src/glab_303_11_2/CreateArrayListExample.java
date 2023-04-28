package glab_303_11_2;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

	public static void main(String[] args) {
		// creating an ArrayList of String
		List<String> animals = new ArrayList<String>(); 
		
		// adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		
		System.out.println(animals);
		
		//adding an element at a particular index in an ArrayList
		animals.add(2, "Elephant");
		System.out.println(animals);
	}

}
