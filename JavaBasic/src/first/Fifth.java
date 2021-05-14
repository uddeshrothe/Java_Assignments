package first;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int income = input.nextInt();
		
		if(income > 0 && income < 180000) {
			System.out.println("Tax amount: 0");
		} else if(income > 181001 && income < 300000) {
			System.out.println("Tax amount: "+ income*0.1 );
		} else if(income > 300001 && income < 500000) {
			System.out.println("Tax amount: "+ income*0.2 );
		} else if(income > 500001 && income < 1000000) {
			System.out.println("Tax amount: "+ income*0.3 );
		}
		input.close();

	}

}
