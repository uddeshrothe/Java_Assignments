package third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection9 {

	public static void main(String[] args) {
		
		ArrayList<SavingAccount> accounts = new ArrayList<SavingAccount>();
		
		SavingAccount customer1 = new SavingAccount(5000,13,"Joe",true);
		SavingAccount customer2 = new SavingAccount(10000,12,"John",true);
		SavingAccount customer3 = new SavingAccount(15000,3,"Jenny",true);
		SavingAccount customer4 = new SavingAccount(8000,4,"Jack",true);
		
		accounts.add(customer1);
		accounts.add(customer2);
		accounts.add(customer3);
		accounts.add(customer4);
		
		customer1.getDeposit(4000);

		for(SavingAccount str: accounts) {
			System.out.println(str.getAcc_balance()+", "+str.getAcc_id()+", "+str.getAcc_holdername());
		}
		
		Collections.sort(accounts, new Comparator<SavingAccount>() {

			@Override
			public int compare(SavingAccount o1, SavingAccount o2) {
				// TODO Auto-generated method stub
				
				return o1.getAcc_id() - o2.getAcc_id();
			}
		});
		
		for(SavingAccount str: accounts) {
			System.out.println(str.getAcc_balance()+", "+str.getAcc_id()+", "+str.getAcc_holdername());
		}
		
	}

}

class SavingAccount {
	
	private int acc_balance;
	private int acc_id;
	private String acc_holdername;
	private boolean isSalaryAccount;
	private int deposit;
	private int withdraw;
	
	public SavingAccount(int acc_balance, int acc_id, String acc_holdername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.acc_holdername = acc_holdername;
		this.isSalaryAccount = isSalaryAccount;
		
	}
	
	public void display() {
	    System.out.println("CustomerID:" + acc_id);
	    System.out.println("Balance:" + acc_balance);
	    System.out.println("HolderName " + acc_holdername); 

	  }
	
	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getAcc_holdername() {
		return acc_holdername;
	}

	public void setAcc_holdername(String acc_holdername) {
		this.acc_holdername = acc_holdername;
	}

	public int getDeposit() {
		return deposit;
	}

	public int getDeposit(int deposit) {
		acc_balance +=deposit;
		return acc_balance;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw(int withdraw) {
		return acc_balance -= withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	@Override
	public String toString() {
		return "[ AccountBalance: " + acc_balance+", AccountID: " + acc_id + ", AccounHolderName: " + acc_holdername +", SavingsAccount: " + isSalaryAccount+"]";
		
	}
	
}

