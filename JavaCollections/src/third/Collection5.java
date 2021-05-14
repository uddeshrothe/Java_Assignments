package third;

import java.util.HashMap;
import java.util.Map;

class Test 
{
      
    String name;
    int id;
      
    Test(String name, int id)
    {
          
        this.name = name;
        this.id = id;
    }
      
    public boolean equals()
    {
        return true;
    }
      
    @Override
    public int hashCode()
    {
        return this.id;
    }
      
}

public class Collection5 {

	public static void main(String[] args) {
		
		 	Test g1 = new Test("aditya", 1);
	        Test g2 = new Test("aditya", 1);
	          
	        Map<Test, String> map = new HashMap<Test, String>();
	        map.put(g1, "Joe");
	        map.put(g2, "Kenny");
	          
	        for(Test test : map.keySet())
	        {
	            System.out.println(map.get(test).toString());
	        }

	}

}


