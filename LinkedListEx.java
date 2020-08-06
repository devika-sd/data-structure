import java.util.*; 
  
public class Test { 
  
    public static void main(String args[]) 
    { 
        // Creating object of the 
        // class linked list 
        LinkedList<String> l
            = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        l.add("A"); 
        l.add("B"); 
        l.addLast("C"); 
        l.addFirst("D"); 
        l.add(2, "E"); 
        //printing element
        System.out.println(l); 
        //removing element from the list
        l.remove("B"); 
        l.remove(3); 
        l.removeFirst(); 
        l.removeLast(); 
         //changing value in tha value or updating
        ll.set(1, "Z");
        System.out.println(ll);
        //for iterating
        // Using the for each loop  
        for (String str : ll)  
            System.out.print(str + " ");
    } 
} 
