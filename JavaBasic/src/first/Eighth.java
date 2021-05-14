package first;

public class Eighth {

	public static void main(String[] args) {
		int n[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		for(int i=0; i< n.length; i++) {
			for(int j= 1;j<(n.length-i);j++) {
				if(n[j-1] > n[j]) {
					temp = n[j-1];
					n[j-1]=n[j];
					n[j]=temp;
				}
			}
			
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i] + " ");
		}

	}

}
