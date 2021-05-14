package fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambda3 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
	    l.add("successfully");
	    l.add("easy");
	    l.add("fortune");
	    List<String> filtered = l.stream().filter( s -> s.length() > 5 ).collect(Collectors.<String>toList());
	    System.out.println("Predicate: ");
	    System.out.println(filtered);
	    
	    //Predicate
	    Predicate<String> isALongWord = t -> t.length() > 10;
		String s = "successfully";
		boolean result = isALongWord.test(s);
		
		//Consumer
		System.out.println("Consumer: ");
		Consumer<Product> updatePrice = p -> p.setPrice(5.9);
	    Product p = new Product();
	    updatePrice.accept(p);
	    p.printPrice();
	    
	    //Function
	    System.out.println("Function: ");
	    int n = 5;
	    modifyValue(n, val-> val + 10);
	    modifyValue(n, val-> val * 100);
	    
	    //Supplier
	    System.out.println("Supplier: ");
	    int m = 3;
        display(() -> m + 10);
        display(() -> m + 100);

	}
	
	//Predicate interface
	Predicate<String> isALongWord = new Predicate<String>() {
	    @Override
	    public boolean test(String t) {
	        return t.length() > 10;
	    }
	};
	
	//Consumer interface
	static class Product {
		  private double price = 0.0;

		  public void setPrice(double price) {
		    this.price = price;
		  }

		  public void printPrice() {
		    System.out.println(price);
		  }
		}
	
	//Function interface
	static void modifyValue(int v, Function<Integer, Integer> function){
	    int result = function.apply(v);
	    System.out.println(result);
	  }
	
	//Supplier interface
	static void display(Supplier<Integer> arg) {
        System.out.println(arg.get());
    }
	}
