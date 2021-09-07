

public class CarObserver implements Observer 
{

	private String lastLight;

	public CarObserver() {}

	public void update(Object arg)
	{
		String currentTrafficLight = (String)arg;

		if("GREEN" == currentTrafficLight) 
		{
			System.out.println(" >>>>>   Let's Go ... Push Accelator ... Drive the Car   <<<<< ");
		} 
		else if("YELLOW" == currentTrafficLight) 
		{
			if("RED" == lastLight) 
			{
				System.out.println(" ****... ====>>   Ready to Go  ... Turn on the car   <<==== ...**** ");
			}
			else 
			{
				System.out.println(" !!!   Slow down the car   !!!");
			}
		}
		else if("RED" == currentTrafficLight) 
		{
			System.out.println(" !!!...###   Stop the Car   ###...!!!");
		}
			lastLight = currentTrafficLight;
	}
}
