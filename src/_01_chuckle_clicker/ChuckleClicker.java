package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}
 public void makeButtons() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.add(panel);
	
	panel.add(punchline);
	panel.add(joke);
	frame.pack();
	joke.setText("joke");
	punchline.setText("punchline");
	joke.addActionListener(this);
	punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "why do penguins wear blue ties?");
	}
	if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "because saturn might have rings!");
	}
}
}
