package first;

public class Seventh {

	public static void main(String[] args) {
		int n[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int a = 19;
		for(int i=0; i< n.length; i++) {
			if(n[i]==a) {
				System.out.println("Number found at : " + i );
				System.exit(0);
			}
		}
		System.out.println("Number not found.");

	}

}
