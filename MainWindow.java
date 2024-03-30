import javax.swing.*;

public class MainWindow extends JFrame {

	//Constructor
	MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	//Show all components of the game
	
	HealthPanel panel = new HealthPanel();
}
