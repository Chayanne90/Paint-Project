


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EastPanel extends JPanel implements ActionListener
{
	//Creating the buttons for the components
	private JButton jbPenColor = new JButton("Pen color");
	private JButton jbEraser = new JButton ("Eraser");
	private JButton jbText = new JButton("Text");
	private JButton jbTextFontColor = new JButton("Font Color");
	
	

	public EastPanel()
	{

		setLayout(new GridLayout(5,1,20,20));
		setBackground(Color.LIGHT_GRAY);
	
		
		jbPenColor.addActionListener(this);
		jbText.addActionListener(this);
		jbEraser.addActionListener(this);

		jbText.setBackground(Color.WHITE);
		jbPenColor.setBackground(Color.WHITE);
		jbPenColor.setOpaque(true);
		jbEraser.setBackground(Color.WHITE);
		
		jbTextFontColor.setBackground(Color.WHITE);
		jbTextFontColor.addActionListener(this);
		jbTextFontColor.setOpaque(true);
		
		add(jbPenColor);
		add(jbText);
		add(jbTextFontColor);
		add(jbEraser);	
	}


	// Action Event when the buttons of the components are pressed

	public void actionPerformed(ActionEvent e)
	{
	
		// Pen color and button color status 
		if(e.getActionCommand().equalsIgnoreCase("Pen Color"))
		{
			CenterPanel.setPenColor(JColorChooser.showDialog(this,"Pen Color ",(CenterPanel.getPenColor())));
			jbPenColor.setBackground(CenterPanel.getPenColor());
		}
		
		// message pop up when is pressed to type in the Center Panel
		if(e.getActionCommand().equalsIgnoreCase("Text"))
		{
			JOptionPane.showMessageDialog(jbText, "To type please click the white board!");
			
		}
		
		// The eraser 
		if (e.getActionCommand().equalsIgnoreCase("Eraser"))
		{
			
			CenterPanel.setPenColor(Color.LIGHT_GRAY);
			CenterPanel.setPenSize(40);
		}
		
	
		// Font and button color status 
		if (e.getActionCommand().equalsIgnoreCase("Font Color"))
		{
			TypingAndDrawing.setFontColor(JColorChooser.showDialog(this,"Font Color ",(TypingAndDrawing.getFontColor())));
			jbTextFontColor.setBackground(TypingAndDrawing.getFontColor());
			
		}


	} // End of Action Event
}
