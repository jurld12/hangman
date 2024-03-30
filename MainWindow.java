import javax.swing.*;

public class MainWindow extends JFrame {

	//Constuctor
	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		HealthPanel panel = new HealthPanel();
		add(panel);
		
		
		
	}
	//Show all components of the game
	
}
