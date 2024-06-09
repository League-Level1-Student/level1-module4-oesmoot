package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
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
	frame.setSize(250,140);
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed =(JButton) e.getSource();
}
}
