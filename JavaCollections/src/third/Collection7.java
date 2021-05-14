package third;

import java.util.*;

public class Collection7 {
	String owerName;
	String carModel;
	int  carNo;
	String owerMobileNo;
	String owerAddress;
	
	public Collection7(String owerName, String carModel, int carNo, String owerMobileNo, String owerAddress) {
		
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}
	
	
	public String toString()
	 {
		 return  owerName+"|"+carModel+"|"+carNo+"|"+owerMobileNo+"|"+owerAddress;
	 }


	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getOwerMobileNo() {
		return owerMobileNo;
	}

	public void setOwerMobileNo(String owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}


	public void remove() {
		// TODO Auto-generated method stub
		
	}
}

class Parked_Car_Owner_List
{

	static Collection7 p1= new Collection7("Joe", "BMW", 1717, "9579118286", "California");
	static Collection7 p2= new Collection7("John", "Audi", 1878, "9372356525", "London");
	static Collection7 p3= new Collection7("Jenny", "Maruhi", 1978, "8459950230", "LA");
	static Collection7 p4= new Collection7("Jack", "Bugati", 1277, "8284829829", "Silicon Valley");
     
	  static TreeMap<Integer,Collection7> h= new TreeMap<Integer,Collection7>();
	  
	
	static int add_new_car(Collection7 obj)
	{
		
		h.put(100, p1);
		h.put(101, p2);
		h.put(102, p3);
		h.put(103, p4);
		
		System.out.println(h);
		return 0;
	}
	
	 public static  Object remove1(int n)
	 {
		 
		 h.remove(n); 
		 System.out.println(h);
		return h; 
		    
	 }
	 
	 public static Object Get_owner_information(int token)
	 {
		  
		 System.out.println(h.get(token));
		 return h.get(token);	 
	 }
	 
	public static void main(String[] args) {
		
		add_new_car(p1);
		
		remove1(102);
		
		Get_owner_information(103);
			
	}
}
