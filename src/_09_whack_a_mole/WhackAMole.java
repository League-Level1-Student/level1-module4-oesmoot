package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
int molesWhacked = 0;
Date timeAtStart = new Date();
int molesMissed = 0;

public void setup() {
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,140);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
}
public void drawButtons() {
	Random ran = new Random();
	button1.setText("          ");
	button2.setText("          ");
	button3.setText("          ");
	button4.setText("          ");
	button5.setText("          ");
	button6.setText("          ");
	button7.setText("          ");
	button8.setText("          ");
	button9.setText("          ");
	int moleNum = ran.nextInt(9);
	if(moleNum == 0) {
		button1.setText("MOLE");
	}
	else if(moleNum == 1) {
		button2.setText("MOLE");
	}
	else if(moleNum == 2) {
		button3.setText("MOLE");
	}
	else if(moleNum == 3) {
		button4.setText("MOLE");
	}
	else if(moleNum == 4) {
		button5.setText("MOLE");
	}
	else if(moleNum == 5) {
		button6.setText("MOLE");
	}
	else if(moleNum == 6) {
		button7.setText("MOLE");
	}
	else if(moleNum == 7) {
		button8.setText("MOLE");
	}
	else if(moleNum == 8) {
		button9.setText("MOLE");
	}
	
}
public static void main(String[] args) {
	WhackAMole mole = new WhackAMole();
	mole.setup();
	mole.drawButtons();
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed =(JButton) e.getSource();
	if(buttonPressed.getText().equalsIgnoreCase("Mole")) {
		playSound("9648ae0f-e14a-4d1d-8170-a41a752a3dff.wav");
		this.drawButtons();
		molesWhacked ++;
		if(molesWhacked >= 10) {
			endGame(timeAtStart,molesWhacked);
		}
	}
	else {
		molesMissed ++;
		if(molesMissed == 1) {
			speak("miss");
		}
		else if(molesMissed == 2) {
			speak("again?");
		}
		else if(molesMissed ==3) {
			speak("okay, i'll let you off this time, but be careful");
		}
		else if(molesMissed ==4) {
			speak("okay, this is your last warning, you gotta get your act together or you will lose.");
		}
		else if(molesMissed == 5) {
			speak("alright, that's it! i've had it with your shenannigans! I told you not to miss four whole times and you still kept going? you lose!");
			endGame(timeAtStart,molesWhacked);
		}
                
    }

	
}
private void speak(String missComment) {
	try {
		Runtime.getRuntime().exec( "say " + missComment ).waitFor();
	} catch (InterruptedException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

}
