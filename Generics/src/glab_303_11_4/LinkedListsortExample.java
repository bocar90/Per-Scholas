package glab_303_11_4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {

	public static void main(String[] args) {
		// create linked list
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("A");
		linkedlist.add("C");
		linkedlist.add("B");
		linkedlist.add("D");
		
		//Unsorted
		System.out.println(linkedlist);
		
		//Sort the list
		Collections.sort(linkedlist);
		
		//Sorted
		System.out.println(linkedlist);
		
		//Custonm sorting
		Collections.sort(linkedlist, Collections.reverseOrder());
		
		//Custom sorted
		System.out.println(linkedlist);

	}

}
