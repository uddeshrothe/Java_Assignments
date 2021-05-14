package fourth;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda8 {

	public static void main(String[] args) {
		Consumer<Integer> consumer= i-> System.out.print(" "+i);
		  
		  List<Integer> integerList=Arrays.asList(new Integer(1),
		                            new Integer(10), new Integer(200),
		                            new Integer(101), new Integer(-10),
		                            new Integer(0));
		  printList(integerList);
		 }
	
		 public static void printList(List<Integer> listOfIntegers){
		   System.out.println(listOfIntegers); 
	}

}
