package test2;

class BankAccount {
	int fd, cc;
	int AccountHolder(int fd) {
		System.out.println("Savings Account");
		return fd;
	}
	
	double AccountHolder(double cc) {
		System.out.println("Current Account");
		return cc;
	}
	
	void AccountHolder(int fd, double cc) {
		double total = fd + cc;
		System.out.println("Total money at Bank: " + total);
	}
}

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		b.AccountHolder(5500, 4500);
		int c= b.AccountHolder(500);
		double d = b.AccountHolder(607.50);
		b.AccountHolder(c,d);
	}

}
