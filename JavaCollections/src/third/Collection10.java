package third;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection10 {
     String mov_Name;
     String lead_Actor;
     String lead_Actories;
     String Genre;
	public Collection10(String mov_Name, String lead_Actor, String lead_Actories,String Genre) {

		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actories = lead_Actories;
		this.Genre=Genre;
	}

	public String toString()
	 {
		 
		 return  mov_Name+"="+lead_Actor+"|"+lead_Actories+"|"+Genre+"|";
	 }
	
	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_Actor() {
		return lead_Actor;
	}
	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}
	public String getLead_Actories() {
		return lead_Actories;
	}
	public void setLead_Actories(String lead_Actories) {
		this.lead_Actories = lead_Actories;
	}   
}

class Movie_dataList{
	
	public static void main(String[] args) {
		
		List<Collection10> movie=Arrays.asList(
		new Collection10("Avengers", "Chris","Scarlett","Adventure"),
		  new Collection10("Due Date","Robert","Emma","Comedy"),
		 new Collection10("War","Hrithik","Vaani","Action")
	);
		Collections.sort(movie,new Comparator<Collection10>()
				{

					@Override
					public int compare(Collection10 o1, Collection10 o2) {
						return o1.mov_Name.compareTo(o2.mov_Name);
						
					}
				});
		
		printallmovie(movie);
		remove_movie(movie, "Avatar");

	}
		
	private static void printallmovie(List<Collection10> movie) {
		for(Collection10 p:movie)
		System.out.println(p);
	}

	public static void remove_movie(List<Collection10> movie,String name)
	{
	movie.remove(name);
	}

}