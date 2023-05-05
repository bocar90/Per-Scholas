package glab_303_11_5;

import java.util.TreeSet;

public class TreeSetExampleCom {

	public static void main(String[] args) {
		//create a TreeSet with user-defined comparator
		TreeSet<String> cities = new TreeSet<>(new Cities_Comparator());
		cities.add("UAE");
		cities.add("Mumbai");
	    cities.add("NewYork");
	    cities.add("Hyderabad");
	    cities.add("Karachi");
	    cities.add("Xanadu");
	    cities.add("Lahore");
	    cities.add("Zagazig");
	    cities.add("Yingkou");
	    
	    //print the contents of treeSet
	    System.out.println("TreeSet: " + cities);
	}

}
