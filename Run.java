import java.awt.Dimension;
import java.awt.Toolkit;

public class Run {

	public static void main(String[] args) {
		//the creation of an instance of your main window 
		MainWindow newgame = new MainWindow();
		//definition of the title
		newgame.setTitle("Hangman");
		//definition of the size
		newgame.setSize(600,600);
		//Find screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		int x = (int) ((screenSize.getWidth() - newgame.getWidth()) / 2); 
		
		newgame.setLocation();
		//visibility of this main window
		newgame.setVisible(true);
		
		/*
		 * Note: The provided Run class is 
		 * the only place of the program that 
		 * should have a main method.
		 * 
		 * This class should not contain anything 
 		   else but the main method and the 
 		   main method should not contain any
 		   code apart from the creation of an 
 		   instance of your main window and 
 		   the definition of the title, size, and
 		   visibility of this main window.*/

	}

}

