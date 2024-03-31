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

		WordPanel guess = new WordPanel("octopus");
		this.add(guess);
		this.setResizable(true);
		
		this.setVisible(true);
		//this.add(guess.add_Uscore());
		//this.add(guess.add_Uscore());
		
	}
}
