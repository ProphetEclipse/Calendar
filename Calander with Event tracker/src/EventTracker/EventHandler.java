package EventTracker;

public class EventHandler {
	
	public void checkDay(Calendar a , EventInfo b){
		int cDay = a.getDay();
		int eDay = b.getDay();
		if(cDay == eDay){
			System.out.println(cDay + " is marked on the eventTracker");
		}
	}
}
	
	