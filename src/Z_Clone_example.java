import java.util.ArrayList;

import java.io.*;
import java.util.ArrayList;

public class Z_Clone_example{


	    public static void main(String args[])
	    {
	  
	        // Creating an empty ArrayList
	        ArrayList<String> list
	            = new ArrayList<String>();
	  
	        // Use add() method
	        // to add elements in the list
	        list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	        list.add("10");
	        list.add("20");
	  
	        // Displaying the list
	        System.out.println("First ArrayList: "
	                           + list);
	  
	        // Creating another linked list and copying

	        ArrayList sec_list = (ArrayList)list.clone();
	        
	        sec_list.remove(1);
	        
	        // Displaying the other linked list
	        System.out.println("Second ArrayList is: "
	                           + sec_list);
	    }
	}
	
	
	
//    // create an arraylist
//    ArrayList<Integer> prime = new ArrayList<Integer>();
//    ArrayList<Integer> second = new ArrayList<Integer>();
//    prime.add(2);
//    prime.add(3);
//    prime.add(5);
//    System.out.println("Prime Number: " + prime);
//    second = (ArrayList)prime.clone();
//    // print the return value of clone()
//    System.out.println("Return value of clone(): " + second);
//    
//    second.add(10);
//    
//    System.out.println("After modifing");
//    System.out.println("Prime Number: " + prime);
//
//    // print the return value of clone()
//    System.out.println("Return value of clone(): " + second);
//        
//    }
