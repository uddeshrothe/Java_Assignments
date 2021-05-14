package first;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c=0;
		
		while(c<3) {
			
		String  user = sc.nextLine();
		String password = sc.nextLine();
			
		if(user.equals("Uddesh")&& password.equals("Uddesh@123")) {
			System.out.print("Welcome " + user);
			System.exit(0);
		}
		c++;
		}
		System.out.println("Contact Admin");
		
		sc.close();

	}

}
