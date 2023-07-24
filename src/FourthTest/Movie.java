package FourthTest;

import java.util.ArrayList;

public class Movie {
	private String title;
	private String director;
	private ArrayList<String>actor;
	private ArrayList<Reviews>review;
	public Movie(String title,String director,ArrayList<String>actor)
	{
		this.title=title;
		this.director=director;
		this.actor=actor;
		this.review=new ArrayList<Reviews>();
	}
	
	public void addReview(Reviews r)
	{
		review.add(r);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<String> getActor() {
		return actor;
	}

	public void setActor(ArrayList<String> actor) {
		this.actor = actor;
	}

	public ArrayList<Reviews> getReview() {
		return review;
	}

	public void setReview(ArrayList<Reviews> review) {
		this.review = review;
	}
	
}
