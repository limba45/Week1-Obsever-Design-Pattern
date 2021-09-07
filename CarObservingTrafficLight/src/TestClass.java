

 /*
  *             NOTE
  *  
  *  In this program we can extend it to multiple observers, 
  *  
  *  For example, On traffic lights Traffic Police can also be the Observer
  *  Other than this there are multiple type of Vehicles that can be Observer
  *  Even a Pedestrian can also be the Observer
  *  
  *  But since in feedback it was mentioned that create observer for the car,
  *  So it is limited to a car observer.
  * 
  * 
  */
public class TestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		TrafficLightSubject trficlightobservr = new TrafficLightSubject();
		
		CarObserver car = new CarObserver();
		
		trficlightobservr.addObserver(car);
	
		trficlightobservr.runn();
	}

}
