// Clone() method: sinclonar creando dos objectos, creo dos referencias al mismo objecto

import java.util.ArrayList;


public class Z_Clone {


	  
	    public static void main(String args[])
	    {
	  
	        // Creating an empty ArrayList
	        ArrayList<String> list
	            = new ArrayList<String>();
	  
	        // Use add() method
	        // to add elements in the list
	        list.add("Ciao");
	        list.add("desde el");
	        list.add("curso");
	        list.add("java");
	        list.add("de javi");
        
	        // Displaying the list
	        System.out.println("First ArrayList: "
	                           + list);
	  
	        // Creating another linked list and copying
	        ArrayList sec_list = new ArrayList();
	        sec_list = (ArrayList)list.clone();//
	  
	        // Creating third linked list and copying
	        ArrayList tir_list = new ArrayList();
	        tir_list.add("Ciao");
	        tir_list.add("Ciao");       
	        
	        
	        // Displaying the other linked list
	        System.out.println("Second ArrayList is: "
	                           + sec_list);
	        
	        // modify lists
	        // Creating another linked list and copying
	        
	        list.remove(1);	        
	        //sec_list.remove(1);
	        
	        
	        // Displaying the lists
	        System.out.println("Dsplay all lists");
	        
	        System.out.println("First ArrayList: "
	                           + list);

	        System.out.println("Second ArrayList is: "
	                           + sec_list);
	        
	        System.out.println("Third ArrayList is: "
                    + tir_list);
	        
	        // Referencia 
	        System.out.println(list);
	        System.out.println(sec_list);
	        System.out.println(tir_list);
	    }
	}

