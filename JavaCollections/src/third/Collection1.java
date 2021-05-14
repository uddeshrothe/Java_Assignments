package third;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collection1 {

	public static void main(String[] args) {
		
		SortedSet<Person> persons =new TreeSet<>();
		
		persons.add(new Person(45, 190,"Doe"));
		persons.add(new Person(45, 175,"Jack"));
		persons.add(new Person(65, 180,"Ann"));
		
		System.out.println(persons);
		
		persons = new TreeSet<>(Comparator.comparing(Person::getWeight).thenComparing(Person::getHeight));
		
		persons.add(new Person(45, 190,"Doe"));
		persons.add(new Person(45, 175,"Jack"));
		persons.add(new Person(65, 180,"Ann"));
		
		System.out.println("After sorting:");
		System.out.println(persons);

	}

}

 class Person implements Comparable<Person>{
	private int weight;
	private int height;
	private String name;
	
	public Person(int weight, int height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Person person) {
		return this.getWeight() - person.getWeight();
	} 
	
	public String toString() {
		return "Person{" +"weight=" + weight +",height="+ height +", name=" + name +'\''+ '}';
	}
	
}