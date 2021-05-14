package fourth;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda4 {

	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Ann","henry","Riley","Mark","Steve","Michael","Jos"));
		 
        numbers.removeIf( number -> number.length()%2 != 0 );
         
        System.out.println(numbers);

	}

}
