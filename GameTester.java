package OOPProjekt;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GUIÜbung.GamePanel;

public class GameTester {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setSize(new Dimension(768, 438));

		GameMenu mpanel = new GameMenu();

		GPanel gpanel = new GPanel();
	 frame.getContentPane().add(gpanel);

		frame.pack();

		frame.setVisible(true);


}
}