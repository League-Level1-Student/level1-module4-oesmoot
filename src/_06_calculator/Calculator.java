package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
	multiplyButton.addActionListener(this);
	frame.pack();
}

public void add() {
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
	
}
}
