

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NorthPanel extends JPanel  
{
 // Creating a welcome Label 
	private JLabel label=new JLabel("<<- Welcome to the Drawing board app ->> ");

	
	public NorthPanel()
	{

	setBackground(Color.LIGHT_GRAY);
	add(label); // adding the Label to the North Panel.
	
	}
		
	public void editHeading(String s)
	{
		
		label.setText(s);
	}

}
