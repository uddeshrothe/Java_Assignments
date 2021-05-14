package test2;

abstract class DessertItem{
	abstract void getCost();
}

class Candy{
	void getCost(int i, int cPrice, int cTax) {
		cPrice = 10 * 60;
		cTax = 1;
		
		System.out.println("Price of Candy: " + i*cPrice*cTax);
	}
}
class Cookie{
	 void getCost(int i, int ckPrice, int ckTax) {
		 ckPrice = 20 * 70;
		 ckTax = 2;
		 
		 System.out.println("Price of Cookie: " + i*ckPrice*ckTax);
	 }
}
class IceCream{
	void getCost(int i, int icPrice, int icTax) {
		icPrice = 1000;
		icTax = 5;
		
		System.out.println("Price of IceCream: " + i*icPrice*icTax);
	}
}

public class Seventh {

	public static void main(String[] args) {

	}

}
