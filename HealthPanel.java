import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

public class HealthPanel extends JPanel {
	

	public HealthPanel() {
		this.setSize(550,90);
		this.setVisible(true);
	}
	
	public JLabel Label1() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(5,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label2() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(90,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label3() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(175,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label4() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(260,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label5() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(345,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label6() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(430,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public JLabel Label7() {
		JLabel guess1 = new JLabel("1");
		guess1.setBounds(515,20,80,150);
		//guess1.setSize(80,120);

		//guess1.setHorizontalTextPosition(JLabel.LEFT);
		//guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setForeground(Color.BLACK);
		guess1.setBackground(Color.GREEN);
		guess1.setHorizontalTextPosition(JLabel.CENTER);
		guess1.setVerticalTextPosition(JLabel.CENTER);
		guess1.setHorizontalAlignment(JLabel.CENTER);
		guess1.setVerticalAlignment(JLabel.CENTER);
		guess1.setOpaque(true);
		guess1.setVisible(true);

		return guess1;
	}
	
	public int removeLife(char guess) {
		ArrayList<Character> answer_letters = new ArrayList<Character>();
		
		int guesses_total = 7;
		int guesses_left = 7;
		for(char c : answer_letters) {
			if (guess == c) {
				//Correct subrouting
			} else {
				for(int i = 0; i < guesses_left; i++) {
				guesses_left = guesses_left - 1;
				Label1().setBackground(Color.RED);
				}
			}
		}
		

		return guesses_left;
	}
}
