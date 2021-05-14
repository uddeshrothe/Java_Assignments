package fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Lambda6 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "bye", "sorry", "help", "run"));
        
        System.out.println(words);
         
        words.replaceAll( new MyOperator() );  
         
        System.out.println(words);
		
	}

}

class MyOperator implements UnaryOperator<String> 
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}