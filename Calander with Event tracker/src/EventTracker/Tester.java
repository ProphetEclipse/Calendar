package EventTracker;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar myCalendar = new Calendar(10,26,1995);
		EventInfo myEvent = new EventInfo("Birthday",10,26,1995);
		EventHandler handler = new EventHandler();
		
		handler.checkDay(myCalendar,myEvent);
		}	
}
