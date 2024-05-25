package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
public static void main(String[] args) {
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
		label.setText(String.valueOf(currentLetter));
	}

}
