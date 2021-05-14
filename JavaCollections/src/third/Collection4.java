package third;

import java.util.Arrays;
import java.util.HashMap;

public class Collection4 {

	public static void main(String[] args) {
		
		HashMap<Datec, String> m = new HashMap<Datec, String>(); 

		Datec mydate =new Datec(19, 2, 2000);
	    m.put(mydate,"Joe");
	    Datec mydate2 =new Datec(18, 9, 2002);
	    m.put(mydate2,"John");
	    Datec mydate3 = new Datec(19,2, 2000);
	    m.put(mydate3, "Jenny");
	    
	    m.entrySet().forEach(entry -> {
	        System.out.println(entry.getKey() + " " + entry.getValue());
	    });
	    
	    System.out.println(Arrays.asList(m)); 
	}

}

class Datec {
	
	int day;
	int month;
	int year;
	public Datec(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString() {
		return "DateofBirth{" +"Day=" + day +",Month="+ month +", Year=" + year+'\''+ '}';
	}
	
}
