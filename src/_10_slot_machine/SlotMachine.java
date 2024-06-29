package _10_slot_machine;

import java.awt.Dimension;
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


private ImageIcon createImageIcon(String fileName) {
	try {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return null;
		}
		ImageIcon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return icon;
	} catch (Exception e) {

	}
	return null;
}
ImageIcon imgA = createImageIcon("Etvideogamecover.jpg");
ImageIcon imgB = createImageIcon("majora's-mask.jpg");
ImageIcon imgC = createImageIcon("mario-duck-hunt.jpg");
ImageIcon imgD = createImageIcon("Outer_Wilds.jpg");
ImageIcon imgE = createImageIcon("Wii-Sports.jpeg");

JLabel a = new JLabel();
JLabel b = new JLabel();
JLabel c = new JLabel();
JButton button = new JButton();
JLabel dollarz = new JLabel();

Random ran = new Random();
int choiceA = ran.nextInt(5);
int choiceB = ran.nextInt(5);
int choiceC = ran.nextInt(5);
public void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.setPreferredSize(new Dimension(1000,600));
	panel.setLayout(null);
	a.setBounds(10,10,300,500);
	b.setBounds(320,10,300,500);
	c.setBounds(630,10,300,500);
	dollarz.setBounds(10,520,150,20);
	dollarz.setText(String.valueOf(money));
	panel.add(dollarz);
	panel.add(a);
	panel.add(b);
	panel.add(c);
	button.setBounds(1,1,50,10);
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
	//panel.removeAll();
	choiceA = ran.nextInt(5);
	choiceB = ran.nextInt(5);
	choiceC = ran.nextInt(5);
	if (choiceA == 0) {
		a.setIcon(imgA);
	}
	else if(choiceA == 1) {
		a.setIcon(imgB);;
	}
	else if(choiceA == 2) {
		a.setIcon(imgC);;
	}
	else if(choiceA == 3) {
		a.setIcon(imgD);;
	}
	else if (choiceA == 4) {
		a.setIcon(imgE);
	}
	if (choiceB == 0) {
		b.setIcon(imgA);
	}
	else if(choiceB == 1) {
		b.setIcon(imgB);
	}
	else if(choiceB == 2) {
		b.setIcon(imgC);
	}
	else if(choiceB == 3) {
		b.setIcon(imgD);
	}
	else if (choiceB == 4) {
		b.setIcon(imgE);
	}
	if (choiceC == 0) {
		c.setIcon(imgA);
	}
	else if(choiceC == 1) {
		c.setIcon(imgB);
	}
	else if(choiceC == 2) {
		c.setIcon(imgC);
	}
	else if(choiceC == 3) {
		c.setIcon(imgD);
	}
	else if (choiceC == 4) {
		c.setIcon(imgE);
	}
	
	if(choiceA == 0 && choiceB == 0 && choiceC == 0) {
		JOptionPane.showMessageDialog(null, "you got the $1 prize!");
		money+=1;
	}
	if(choiceA == 1 && choiceB == 1 && choiceC == 1) {
		JOptionPane.showMessageDialog(null, "you got the $10,000 prize!");
		money+=10000;
	}
	if(choiceA==2&&choiceB==2&&choiceC==2) {
		JOptionPane.showMessageDialog(null, "you got the $100 prize!");
		money+=100;
	}
	if(choiceA==3&&choiceB==3&&choiceC==3) {
		JOptionPane.showMessageDialog(null, "you got the $1,000,000 prize!");
		money+=1000000;
	}
	if(choiceA==4&&choiceB==4&&choiceC==4) {
		JOptionPane.showMessageDialog(null, "you got the $1000 prize!");
		money+=1000;
	}
	dollarz.setText(String.valueOf(money));
	frame.pack();
	//panel.repaint();
}
}
