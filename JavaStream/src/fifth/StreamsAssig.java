package fifth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamsAssig {
	

	static List<Fruit> users = Arrays.asList(
            new Fruit("Apple",50, "Red", 90),
            new Fruit("Banana",20,"Yellow", 110),
            new Fruit("Pineapple",60, "Yellow", 95),
            new Fruit("Guava",15, "Green", 100),
            new Fruit("Watermelon",70,"Red", 105));
	
	static List<News> user2 = Arrays.asList(
			new News(1,"Jay","Jane","Budget is Bad!"),
			new News(4,"Jack","Renny","I am Awesome!"),
			new News(3,"Jenny","Joe","Fight! If you don't, you can't win."),
			new News(2,"John","Miranda", "Yes but Budget is important"));
	
	
	public static void main(String[] args) {
		
		Trader Chris =new Trader("Chris","London");
		Trader Tom =new Trader("Tom","LA");
		Trader Robert =new Trader("Robert","Mumbai");
		Trader Paul =new Trader("Paul","LA");
		Trader Scarlett =new Trader("Scarlett","Mumbai");
		Trader Banner =new Trader("Banner","London");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(Chris,2011,400),
				new Transaction(Tom,2011,1400),
				new Transaction(Robert,2012,800),
				new Transaction(Paul,2011,1400),
				new Transaction(Scarlett,2012,900),
				new Transaction(Banner,2011,1400));
		
		//Question 1
		 System.out.println("For Less than 100 calories");
	        users.stream()
	        .filter(t->(t.calories<100))
	        .collect(Collectors.toList())
	        .forEach(t->System.out.println(t));
	        
	      //Question2. Display color wise list of fruit names
	        System.out.println("\nSort according to color");
	        users.stream()
	        .sorted((p1,p2)->p1.color.compareTo(p2.color))
	        .forEach(System.out::println);
	        
	        //Question3 Display only RED color fruits sorted as per their price in ascending order.
	        System.out.println("\nSort Red color fruits sorted withprice in ascending");
	        users.stream()
	        .filter(t->t.color.equals("Red"))
	        .forEach(t->System.out.println(t));
	        
	        //Question4 Find out the newsId which has received maximum comments.
	        System.out.println("\nnewsId which has received maximum comments");
	        int p=user2.stream()
	          .min((p1,p2)-> {
	           return (int) p1.getNewsId()+p2.getNewsId();
	           }).get().getNewsId();
	          System.out.println(p);
	      	
	        
	         //Question5 Find out how many times the word 'budget' arrived in user comments all news.
	                System.out.println("\nthe word 'budget' arrived in user comments ");
	        user2.stream()
	        .filter(t->t.comment.contains("budget"))
	        .forEach(t->System.out.println(t));
	        
	        //Question6 Find out which user has posted maximum comments.
	         System.out.println("\nwhich user has posted maximum comments");
	         String n=user2.stream()
	        .max((p1,p2)-> {
	         return (int) p1.getCommentByUser().compareTo(p2.getCommentByUser());
	         }).get().getCommentByUser();
	      	
	        System.out.println(n);

	        //Question7 Display commentByUser wise number of comments
	         System.out.println("\ncommentByUser wise number of comments");
	        user2.stream()
	        .sorted((p1,p2)->p1.getCommentByUser().compareTo(p2.getCommentByUser()))
	        .collect(Collectors.toList())
	        .forEach(t->System.out.println(t.commentByUser+"="+t.comment));
	        
	        
	        
	      //Question8.Find all transactions in the year 2011 and sort them by value
			List<Transaction> result8 = transactions.stream()
					.filter( (t)->t.getYear()==2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList());
			result8.forEach(System.out::println);
			
			
			//Question9. What are all the unique cities where the traders work?
			List<String> result9 = transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getCity)
					.distinct()
					.collect(Collectors.toList());
			result9.forEach(System.out::println);
			
			//10.find all traders from pune and sort them
			List<Trader> result10 = transactions.stream()
					.map(Transaction::getTrader)
					.filter((t)->("Pune").equals(t.getCity()))
					.distinct()
					.sorted(Comparator.comparing(Trader::getName))
					.collect(Collectors.toList());
			result10.forEach(System.out::println);
			
			
			//11. Return a string of all traders’ names sorted alphabetically.
			String allName = transactions.stream()
					.map((t)->t.getTrader().getName())
					.sorted()
					.reduce("",(a,b)->a+" "+b);
			System.out.println(allName);
			
			//12. Are any traders based in Indore?
			boolean flag = transactions.stream()
					.map(Transaction::getTrader)
					.anyMatch(t->t.getCity().equals("Indore"));
			System.out.println("Is there any traders from Indore?"+flag);
			
			//13. Print all transactions’ values from the traders living in Delhi.
			Integer sum = transactions.stream()
					.filter(t->t.getTrader().getCity().equals("Delhi"))
					.map(Transaction::getValue)
					.reduce(0,(a,b)->a+b);
			System.out.println("All transactions for traders living in Delhi: "+sum);
			
			//14. What’s the highest value of all the transactions?
			List<Integer> list = transactions.stream()
					.sorted(Comparator.comparing(Transaction::getValue).reversed())
					.map(Transaction::getValue)
					.limit(1)
					.collect(Collectors.toList());
			System.out.println("In all transactions, the highest transaction amount is"+list.get(0));
			
			//15. Find the transaction with the smallest value.
			Optional<Integer> min = transactions.stream()
					.map(Transaction::getValue)
					.reduce(Integer::min);
			System.out.println("In all transactions, the minimum transaction  amount is:"+min.get());
					

	}


}
