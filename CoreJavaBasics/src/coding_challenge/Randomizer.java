package coding_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Randomizer {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		 
		String[] names = {"Harold", "James", "John", "Andrew", "Philip", "Matthew", "Thomas", "Simon"};
		
		List<String> cloneNames =  new ArrayList<String>(Arrays.asList(names));;
		
		String []randString = new String[names.length];
		
		int i = 0;
		
		while(!cloneNames.isEmpty()) {
			int int_random = rand.nextInt(names.length);
			if(cloneNames.contains(names[int_random])) {
				randString[i] = names[int_random];
				cloneNames.remove(names[int_random]);
				i++;
			}
		}
		
		System.out.println("Orignal array: " + Arrays.toString(names));
		System.out.println("Random array:  " + Arrays.toString(randString));
		
	}

}
