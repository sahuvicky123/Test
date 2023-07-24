package FourthTest;

public class Reviews {
	private String name;
	private String reviewtext;
	private float rating;
	public Reviews(String name, String reviewtext, float rating) {
		this.name = name;
		this.reviewtext = reviewtext;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReviewtext() {
		return reviewtext;
	}
	public void setReviewtext(String reviewtext) {
		this.reviewtext = reviewtext;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	

}
