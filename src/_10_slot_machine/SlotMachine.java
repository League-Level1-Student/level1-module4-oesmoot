package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.DomainCombiner;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
int money = 1000;


private JLabel createLabelImage(String fileName){
	try {
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
ImageIcon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
	}catch (Exception e) {
		
	}
	return null;
}
JLabel imgA = createLabelImage("Etvideogamecover.jpg");
JLabel imgB = createLabelImage("majora's-mask.jpg");
JLabel imgC = createLabelImage("mario-duck-hunt.jpg");
JLabel imgD = createLabelImage("Outer_Wilds.jpg");
JLabel imgE = createLabelImage("Wii-Sports.jpeg");
Random ran = new Random();
int choiceA = ran.nextInt(5);
int choiceB = ran.nextInt(5);
int choiceC = ran.nextInt(5);
public void setup(){
	frame.setVisible(true);
	frame.add(panel);
	panel.setSize(200,200);
	JButton button = new JButton();
	panel.add(button);
	button.setText("spin!");
	button.addActionListener(this);
	frame.pack();	
}
public static void main(String[] args) {
	SlotMachine slots = new SlotMachine();
	slots.setup();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	money -= 20;
	if (money>20) {
		spin();
	}
	else {
		JOptionPane.showMessageDialog(null, "too poor!");
	}
}
public void spin() {
	panel.removeAll();
	
	if (choiceA == 0) {
		panel.add(imgA);
	}
	else if(choiceA == 1) {
		panel.add(imgB);
	}
	else if(choiceA == 2) {
		panel.add(imgC);
	}
	else if(choiceA == 3) {
		panel.add(imgD);
	}
	else if (choiceA == 4) {
		panel.add(imgE);
	}
	if (choiceB == 0) {
		panel.add(imgA);
	}
	else if(choiceB == 1) {
		panel.add(imgB);
	}
	else if(choiceB == 2) {
		panel.add(imgC);
	}
	else if(choiceB == 3) {
		panel.add(imgD);
	}
	else if (choiceB == 4) {
		panel.add(imgE);
	}
	if (choiceC == 0) {
		panel.add(imgA);
	}
	else if(choiceC == 1) {
		panel.add(imgB);
	}
	else if(choiceC == 2) {
		panel.add(imgC);
	}
	else if(choiceC == 3) {
		panel.add(imgD);
	}
	else if (choiceC == 4) {
		panel.add(imgE);
	}
	frame.pack();
}
}
