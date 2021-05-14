package first;

import java.util.Scanner;

public class fourth {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a>60 && b>60 && c>60) {
			System.out.println("Passed!");
		} else if((a>60 && b>60) || (a>60 && c>60) || (b>60 && c>60)) {
			System.out.println("Promoted!");
		} else {
			System.out.println("Failed!");
		}
		input.close();
	}
}
