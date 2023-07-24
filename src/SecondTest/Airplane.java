package SecondTest;

import java.time.LocalTime;

public class Airplane {
	private long flitenumber;
	private String destination;
	private LocalTime sheduletime;
	private int delay;
	
	public Airplane(long flitenumber,String destination,LocalTime sheduletime)
	{
		this.flitenumber=flitenumber;
		this.destination=destination;
		this.sheduletime=sheduletime;
		this.delay=0;
	}

	public long getFlitenumber() {
		return flitenumber;
	}

	public void setFlitenumber(long flitenumber) {
		this.flitenumber = flitenumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getSheduletime() {
		return sheduletime;
	}

	public void setSheduletime(LocalTime sheduletime) {
		this.sheduletime = sheduletime;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
		this.sheduletime=sheduletime.plusMinutes(delay);
	}
	public void checkStatus()
	{
		if(delay==0)
		{
			System.out.println("Flight "+flitenumber+" is ontime.");
		}
		else
		{
			System.out.println("Flight "+flitenumber+" is delayed by "+delay);
		}
	}
	
	

}
