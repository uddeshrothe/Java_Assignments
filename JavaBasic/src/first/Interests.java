package first;

import java.util.Scanner;

public class Interests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter principal, rate and time: ");
		int principal = input.nextInt();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		
		double si = (principal * rate * time)/100;
		
		System.out.println("Simple interest is: " + si);
		
		System.out.println("Enter number of times interest is compounded: ");
		int number = input.nextInt();
		
		double ci = principal *(Math.pow((1 + rate/100), (time * number))) - principal;
		
		System.out.println("Compound interest is: " + ci);
		
		input.close();
		

	}

}
