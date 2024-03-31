import javax.swing.*;

public class MainWindow extends JFrame {

	public MainWindow() {
		this.setLayout(null);
		this.setSize(613,600);
		this.setTitle("Hangman");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		//Guessing labels
		
		
		
		HealthPanel UPanel = new HealthPanel();
		this.add(UPanel.Label1());
		this.add(UPanel.Label2());
		this.add(UPanel.Label3());
		this.add(UPanel.Label4());
		this.add(UPanel.Label5());
		this.add(UPanel.Label6());
		this.add(UPanel.Label7());
		
		/*if (UPanel.removeLife() <= 0)	{
			//Subroutine for losing!
		}else {
			
		}*/
		
		
		WordPanel guess = new WordPanel("guess");
		System.out.println(guess.getName().length());
		for(int i = 0; i < guess.getName().length(); i++) {
			//Find a way to display underscores here.
			this.add(guess.add_Uscore());
			
		}
		
		
				
	}
}
