
/* COPYRIGTH Chayanne Paulino*/

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JApplet;

public class MyJApplet extends JApplet 
{
	// Initialization of the class in the main program 
	public void init()
	{
		// North Panel
		NorthPanel jpn = new NorthPanel();
		add(jpn, BorderLayout.NORTH);
		
		// South Panel
		SouthPanel jps  = new SouthPanel();
		add(jps, BorderLayout.SOUTH);
		
		// East Panel
		EastPanel jpe = new EastPanel();
		add(jpe, BorderLayout.EAST);
		
		// West Panel
		WestPanel jpw = new WestPanel();
		add(jpw, BorderLayout.WEST);
		
		//Center Panel
		CenterPanel jpc = new CenterPanel();
		add(jpc, BorderLayout.CENTER);
		
		// Typing and Drawing Panel
		TypingAndDrawing jptc = new TypingAndDrawing();
		add(jptc, BorderLayout.CENTER);
		
	}

}
