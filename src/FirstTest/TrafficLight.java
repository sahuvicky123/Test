package FirstTest;

public class TrafficLight {
	private String colour;
	private int duration;
	
	public TrafficLight(String colour,int duration)
	{
		this.colour=colour;
		this.duration=duration;
	}

	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getDuration() {
		return duration;
	}
	public boolean isred()
	{
		return colour.equals("red");
	}
	public boolean isgreen()
	{
		return colour.equals("green");
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight light=new TrafficLight("red",8);
		System.out.println("light:"+light.getColour()+" Duration:"+light.duration);
		System.out.println(light.isgreen());
		System.out.println(light.isred());
		

	}

}
