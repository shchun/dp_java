

public class NightState implements State {
	private static NightState singleton = new NightState();

	private NightState() {

	}
	
	public static State getInstance() {
		return singleton;
	}

	public void doClock(Context context, int hour) {
		if(9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	public void doUse(Context context) {
		context.callSecurityCenter("Emergency (night)");
	}

	public void doAlarm(Context context) {
		context.callSecurityCenter("Alert (night)");
	}

	public void doPhone(Context context) {
		context.recordLog("Record call(night)");
	}

	public String toString() {
		return "[Night]";
	}

}
