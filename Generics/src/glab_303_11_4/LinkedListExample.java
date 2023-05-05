package glab_303_11_4;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Linked List Declaration
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		//add(String element) is used for adding the elements to the linked list
		linkedlist.add("Item1");
		linkedlist.add("Item5");
	    linkedlist.add("Item3");
	    linkedlist.add("Item6");
	    linkedlist.add("Item2");
	    
	    //Display Linked List content
	    System.out.println("Linked List Content: " + linkedlist);
	    
	    //add first and last element
	    linkedlist.addFirst("First Item");
	    linkedlist.addLast("Last Item");
	    System.out.println("LinkedList content after addition: " + linkedlist);
	    
	    //this is how to get and set values
	    Object firstvar = linkedlist.get(0);
	    System.out.println("First element: " + firstvar);
	    linkedlist.set(0, "Changed first item");
	    Object firstvar2 = linkedlist.get(0);
	    System.out.println("First element after update by set method: " + firstvar2);
	    
	    //remove first and last element 
	    linkedlist.removeFirst();
	    linkedlist.removeLast();
	    System.out.println("LinkedList after deletion of first and last element: " + linkedlist);
	    
	    //add to a position and remove from a position
	    linkedlist.add(0, "Newly added item");
	    linkedlist.remove(2);
	    System.out.println("Final content: " + linkedlist);
	}

}
