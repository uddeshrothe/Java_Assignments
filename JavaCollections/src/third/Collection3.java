package third;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Aiden");
		list.add("Mark");
		list.add("Aloy");
		System.out.println("Given List: ");
		System.out.println(list);
		
		System.out.println("After using ListIterator for reversing order: ");
		ListIterator<String> itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + ", ");
		}
		

	}

}
