import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;


public class ControlPanel extends JPanel  {

	JButton convert;
	JMenu shift;
	CaesarGUI mainGui;
	int ishift;
	
	public ControlPanel(CaesarGUI g) {
		this.mainGui = g;
		this.setBorder(new EtchedBorder());
		this.convert = new JButton("Encrypt");
		this.convert.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				   mainGui.output.setText(
					Caesar.encrypt(ishift, 
						mainGui.input.getText())	   
				   );
				}				
			}
		);
		this.add(convert);
		
		// set up the shift menu
		this.ishift = 13;
		this.shift = new JMenu("Shift 13");
		
		for (int i = 0; i <= 27; i++) {
			JMenuItem jmi = new JMenuItem(Integer.toString(i));
			jmi.addActionListener(
				new ShiftListener(i)
			);
			shift.add(jmi);
		}
		JMenuBar bar = new JMenuBar();
		bar.add(shift);
		this.add(bar);
		//this.setSize(20,20);
	}
	
	class ShiftListener implements ActionListener {
		int shift;
		public ShiftListener(int i) {
		   shift = i;
		}
		
		public void actionPerformed(ActionEvent e) {
			ControlPanel.this.ishift = shift;
			ControlPanel.this.shift.setText("Shift " + shift);
		}
		
	}
	
}