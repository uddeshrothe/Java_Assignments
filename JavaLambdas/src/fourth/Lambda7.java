package fourth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Lambda7 {

	public static void main(String[] args) {
	
		Map<Integer, String> words = new HashMap<>();

		words.put(1, "Joe");
		words.put(2, "Eren");
		words.put(3, "Mike");
		words.put(4, "Chris");
		
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<Integer, String>> iter = words.entrySet().iterator();
		while (iter.hasNext()) {
		    Entry<Integer, String> entry = iter.next();
		    sb.append(entry.getKey());
		    sb.append('=').append('"');
		    sb.append(entry.getValue());
		    sb.append('"');
		    if (iter.hasNext()) {
		        sb.append(',').append(' ');
		    }
		}
		
		System.out.println(sb.toString());
		
		
	}

}

 
