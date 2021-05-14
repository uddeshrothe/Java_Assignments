package fourth;

public class Lambda2 {

	public static void main(String[] args) {
		
		orderTaken oc=(message)->{
			int a = 10000;
			if(a>10000) 
				return  message + " Completed";
			else
				return message + " Incomplete";
		};
		System.out.println(oc.set("Order"));
				
	}
}

interface orderTaken{
	String set(String message);
	
}
