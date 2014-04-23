import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class CaesarGUI extends JPanel {

	JTextArea input, output;
	
	public CaesarGUI() {
		// boilerplate - standard crud
		this.setPreferredSize(new Dimension(400,400));
		JLabel title = new JLabel("Caser Cipher Encrypter");
		title.setBackground(Color.white);
		this.add(title);
		this.add(new ControlPanel(this));
		
		input = new JTextArea("Enter a message to encryprt", 5, 5);
		Font f = new Font("Monospace", Font.PLAIN, 18);
		input.setFont(f);
		input.setEditable(true);
		input.setLineWrap(true);
		input.setBackground(new Color(220,230,220));
		input.setBorder(new TitledBorder(new EtchedBorder(), "Plaintext"));
		this.add(input);
		
		output = new JTextArea(5, 5);
		output.setFont(f);
		output.setEditable(false);
		output.setLineWrap(true);
		output.setBackground(new Color(220,230,220));
		output.setBorder(new TitledBorder(new EtchedBorder(), "Ciphertext"));
		this.add(output);
	}
	
}