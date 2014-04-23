import java.awt.Dimension;

import javax.swing.JFrame;


public class Main {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Caeser");
		frame.getContentPane().add(new CaesarGUI());
		frame.setPreferredSize(new Dimension(600,600));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}