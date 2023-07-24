package FourthTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTest {
	public static void main(String[]args)
	{
		Movie movie1=new Movie("Bahubali","sanjay",new ArrayList<String>(Arrays.asList("prabhas","tamana")));
		Reviews r1=new Reviews("vicky", "good", 4.5f);
		Reviews r2=new Reviews("aman","great movie",4.6f);
		
		movie1.addReview(r2);
		movie1.addReview(r1);
		for(Reviews r:movie1.getReview())
		{
			System.out.println(r.getName()+" "+r.getRating()+" "+r.getReviewtext());
		}
		System.out.println(movie1.getActor().get(0)+" "+movie1.getActor().get(1));
		for(String a:movie1.getActor())
		{
			System.out.println(a);
		}
			
			
		
	}

}
