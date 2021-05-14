package first;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ab=0,bc=0,cd=0;
		for(int i=0;i<3;i++) {
			
			int a=sc.nextInt();
			ab=ab+a;
			int b=sc.nextInt();
			bc=bc+b;
			int c=sc.nextInt();
			cd=cd+c;
			
			int total=a+b+c;
			int avg = total/3;
			
			System.out.print(total+" ");
			System.out.println(avg);
		}
		int total_ab = ab;
		int avg_ab=total_ab/3;
		System.out.print(total_ab+" ");
		System.out.println(avg_ab);
		
		int total_bc= bc;
		int avg_bc=total_bc/3;
		System.out.print(total_bc+" ");
		System.out.println(avg_bc);
		
		int total_cd=cd;
		int avg_cd=total_cd/3;
		System.out.print(total_cd+" ");
		System.out.println(avg_cd);
		
		sc.close();
	}

}
