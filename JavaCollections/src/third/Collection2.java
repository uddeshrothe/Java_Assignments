package third;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection2 {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        System.out.println("Using Hashset: ");
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        } 
        
        
        System.out.println("Using LinkedHashset: ");
        LinkedHashSet<String> set2=new LinkedHashSet();  
        set2.add("One");    
        set2.add("Two");    
        set2.add("Three");   
        set2.add("Four");  
        set2.add("Five");  
 
        Iterator<String> j=set2.iterator();  
        while(j.hasNext())  
        {  
        System.out.println(j.next());  
        }  

	}

}
