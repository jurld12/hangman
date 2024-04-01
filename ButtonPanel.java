

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener{
	JButton button;
	String[] letters = {"A","B", "C", "D", "E", "F",
			"G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z"};

	ButtonPanel(){
		this.setBounds(35,220,520,200);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,3,10));
		//this.setBackground(Color.cyan);






		for (int i = 0; i < letters.length; i++) {
			button = new JButton(letters[i]);
			button.setText(letters[i]);
			button.setBounds(0,50,260,100);
			button.setPreferredSize(new Dimension(52,52));
			button.addActionListener(this);
			button.setFocusable(false);
			this.add(button);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
        clickedButton.setEnabled(false);
				//Call subroutine to guess

				
				
				
				//In the actionPerformed method,
				//you're comparing the source of
				//the event with a single button button. Instead, you should compare it with the button that triggered the event.
				//WordPanel Class:
			}

		






	}


