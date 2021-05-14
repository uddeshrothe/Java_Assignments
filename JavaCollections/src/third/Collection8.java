package third;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Collection8 {

	public static void main(String[] args) {
		Map monthIndex = new HashMap();
		monthIndex.put("1", "January");
		monthIndex.put("2", "February");
		monthIndex.put("3","March");
		 
		Iterator iterator = monthIndex.keySet().iterator();
		 
		while (iterator.hasNext()) {
		System.out.println(monthIndex.get(iterator.next()));
		//adding an element to Map
		//exception will be thrown on next call
		//of next() method.
		monthIndex.put("4", "April");
		}
		
		/* //For test Fail-Safe
		ConcurrentMap monthIndex2 = new ConcurrentHashMap();
        monthIndex2.put("1", "January");
        monthIndex2.put("2", "February");
        monthIndex2.put("3","March");
         
        Iterator iterator2 = monthIndex2.keySet().iterator();
         
        while (iterator2.hasNext()) {
            System.out.println(monthIndex2.get(iterator2.next()));
            monthIndex2.put("4", "April");
        }  
        */
	}

}
