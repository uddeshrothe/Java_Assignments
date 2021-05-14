package first;

public class ArmstrongRange {

	public static void main(String[] args) {

		int n, b, c=0;
		for(int i =100; i<=999; i++) {
		n=i;
		while(n>0) {
			b = n%10;
			c= c+(b*b*b);
			n=n/10;
		}
		if(c==i) {
			System.out.println(i + " is an Armstrong number.");
		}
		c=0;
		
		}

	}

}
