
public class Alarm {
	
	private IAlarmEvent mAlarmEvent;
	
	public Alarm(IAlarmEvent ae){
		
		mAlarmEvent = ae;
		
	}
	
	public void startCountDown(){
		mAlarmEvent.fireAlarm();
	}

}
