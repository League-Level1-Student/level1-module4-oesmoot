package _06_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addButton = new JButton();
JButton subtractButton = new JButton();
JButton multiplyButton = new  JButton();
JButton divideButton = new JButton();
JTextField field1 = new JTextField(10);
JTextField field2 = new JTextField(10);
JLabel label = new JLabel();
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.run();
}

private void run() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(field1);
	panel.add(field2);
	panel.add(addButton);
	addButton.setText("add");
	addButton.addActionListener(this);
	panel.add(subtractButton);
	subtractButton.setText("subtract");
	subtractButton.addActionListener(this);
	panel.add(multiplyButton);
	multiplyButton.setText("multiply");
	multiplyButton.addActionListener(this);
	panel.add(divideButton);
	divideButton.setText("divide");
	divideButton.addActionListener(this);
	panel.add(label);
	panel.setPreferredSize(new Dimension(330,175));
	panel.setLayout(null);
	
	field1.setBounds(10,10,150,30);
	field2.setBounds(170, 10, 150, 30);
	addButton.setBounds(10, 50, 150, 30);
	subtractButton.setBounds(170, 50, 150, 30);
	multiplyButton.setBounds(10,90,150,30);
	divideButton.setBounds(170, 90, 150, 30);
	label.setBounds(150,130,150,30);
	
	
	frame.pack();
}

public void add(double x, double y) {
	label.setText(String.valueOf(x+y));
}
public void subtract(double x, double y) {
	label.setText(String.valueOf(x-y));
}
public void multiply(double x, double y) {
	label.setText(String.valueOf(x*y));
}
public void divide(double x, double y) {
	label.setText(String.valueOf(x/y));
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	double x = 0; 
	double y = 0; 
	try {
	x = Double.parseDouble(field1.getText());
	y = Double.parseDouble(field2.getText());
	}catch(Exception ex) {
		return;
	}
	 
	if(buttonPressed == addButton) {
		add(x,y);
	}
	if(buttonPressed == subtractButton) {
		subtract(x,y);
	}
	if(buttonPressed == multiplyButton) {
		multiply(x,y);
	}
	if(buttonPressed == divideButton) {
		divide(x,y);
	}
	
	
}
}
