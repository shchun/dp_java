

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StateFrame extends Frame implements ActionListener, Context {
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private Button buttonUse = new Button("Use safe");
	private Button buttonAlarm = new Button("Alert bell");
	private Button buttonPhone = new Button("Normal call");
	private Button buttonExit = new Button("Exit");

	private State state = DayState.getInstance();

	public StateFrame(String title) {

		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);

		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);

		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);

		add(panel, BorderLayout.SOUTH);

		pack();
		show();

		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		System.out.println(e.toString());
		if(e.getSource() == buttonUse) {
			state.doUse(this);
		} else if(e.getSource() == buttonAlarm) {
			state.doAlarm(this);
		} else if(e.getSource() == buttonPhone) {
			state.doPhone(this);
		} else if(e.getSource() == buttonExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}

	}
	public void setClock(int hour) {

		String clockString = "Current time is: ";

		if(hour < 10) {
			clockString += "0" + hour + ":00";
		} else {
			clockString += hour + ":00";
		}
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	public void changeState(State state) {
		System.out.println("State changed: " + this.state + " ==> " + state);
		this.state = state;
	}

	public void callSecurityCenter(String msg) {

		textScreen.append("call! " + msg + "\n");
	}

	public void recordLog(String msg) {

		textScreen.append("record ... " + msg + "\n");
	}
}

