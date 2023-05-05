package glab_303_11_5;

import java.util.Collections;
import java.util.HashSet;

public class Examplefour {

	public static void main(String[] args) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<>();
		
		//Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
	    hset.add("Grapes");
	    hset.add("Orange");
	    hset.add("Fig");

	    //Adding of duplicate elements
	    hset.add("Apple");
	    hset.add("Mango");
	    //Adding null values
	    hset.add(null);
	    hset.add(null);
	    
	    //Using advanced for loop
	    for(String str : hset) {
	    	System.out.println(" ---> " + str);
	    }

	}

}
