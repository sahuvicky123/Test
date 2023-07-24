package SecondTest;

import java.time.LocalTime;

public class AirplaneStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane a1=new Airplane(32452,"Mumbai",LocalTime.of(10,12));
		Airplane a2=new Airplane(76553,"Delhi",LocalTime.of(1,6));
		Airplane a3=new Airplane(43562,"Jharkhand",LocalTime.of(14,23));
		a1.checkStatus();
		a2.checkStatus();
		a3.checkStatus();
		a1.setDelay(14);
		a3.setDelay(20);
		a1.checkStatus();
		a2.checkStatus();
		a3.checkStatus();
		System.out.println(a1.getSheduletime());
		a1.getSheduletime();
		

	}

}
