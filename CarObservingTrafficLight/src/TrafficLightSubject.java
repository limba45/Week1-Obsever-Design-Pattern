import java.util.ArrayList;
import java.util.List;


public class TrafficLightSubject implements Subject
{
	
	private int trafficLightNumber = 0;
	private String currentTrafficLightStatus;
	
	//Yellow added two times, because once it will turn on when it will move from reed to green
	// and 2nd time when it will move from green to red
	// and both times action of the car will be different
	
	private String[] traficlights = {"GREEN", "YELLOW", "RED", "YELLOW"};
	

	private List<Observer> observrs = new ArrayList<>();

	public TrafficLightSubject() 
	{	
		currentTrafficLightStatus = traficlights[0]; 
	}
	
	public void runn() throws InterruptedException 
	{
		for(int i = 0; i < 8; i++) 
		{
			//There can be multiple logics to implement this, but this one is best for a single car observer
			//we can even do it with some hard code
			//but tried to do it by implementing a small logic
			
			trafficLightNumber = (trafficLightNumber + 1) % 4;
			
			currentTrafficLightStatus = traficlights[trafficLightNumber];
			
			
			System.out.println("\n ==>> " + currentTrafficLightStatus + " Light");
			
			updateObserver(currentTrafficLightStatus);
		}
	}
	
	public void addObserver(Observer observr) 
	{
		observrs.add(observr);
	}

	public void removeObserver(Observer observr) 
	{
		observrs.remove(observr);
	}

	public void updateObserver(Object arg) 
	{
		for (Observer observr : observrs) 
		{
			observr.update(arg);
		}
	}

	
}
