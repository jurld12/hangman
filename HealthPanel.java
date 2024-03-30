import javax.swing.*;

public class HealthPanel extends JPanel {
	
	public HealthPanel() {
		addLabels();
	}
	
	private void addLabels() {
		for (int i = 1; i <= 7; i++) {
            JLabel label = new JLabel("Life " + i);
            add(label);
        }
	}

	//displays the
	//number of incorrect guesses the player has made
	
	// remaining amount of incorrect guesses that
	//can be made before the game is lost.
	
	//Contain 7 labels and 7 panels
	//equal to the amount of incorrect guesses allowed.
	//To begin with, the labels should be green.

	public int removeLife(){
		int guesses_total = 7;
		int guesses_left = 7;
		// called to update the element once an
		//incorrect guess has been made.
		//One of the green labels should be turned red. 
		
		// The return value
		//of the method can indicate 
		//if the player has run out of 
		//their allotment of incorrect guesses.
		return guesses_left;
	}
}
