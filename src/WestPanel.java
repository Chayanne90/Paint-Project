

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class WestPanel extends JPanel implements ActionListener 
{
	// Radio and Buttons for selecting the type of shape.
	private JLabel jl = new JLabel("Pen:");
	private JButton jb = new JButton();
	private JButton jSize= new JButton("Change Size");
	private JRadioButton jrCircle = new JRadioButton("Circle");
	private JRadioButton jrRectangle = new JRadioButton("Rectangel");
	private JRadioButton jrSquare = new JRadioButton("Square");
	private JRadioButton jrNoShape = new JRadioButton("Shape Off");
	private JButton showImage = new JButton ("show Image");
	private Image image1;
	
	// colors shape button
	private JButton jbCircleColor = new JButton("Circle Color");
	private JButton jbRectColor = new JButton("Rect Color");
	private JButton jbSquareColor = new JButton("Square Color");	

	// radio buttons group
	JPanel shapegroupPanel = new JPanel();
	ButtonGroup shapesGroup = new ButtonGroup();

	public WestPanel()
	{
		setBackground(Color.LIGHT_GRAY); 
		
		setLayout(new GridLayout(5,1,10,10));
		shapegroupPanel.setLayout(new GridLayout(5,3)); 
		shapegroupPanel.setBorder(BorderFactory.createTitledBorder("Shapes")); // group of the Radio buttons 
		shapegroupPanel.setBackground(Color.LIGHT_GRAY);
		add(shapegroupPanel);
		
		jrCircle.addActionListener(this);
		shapegroupPanel.add(jrCircle);
		shapesGroup.add(jrCircle);

		jrRectangle.addActionListener(this);
		shapegroupPanel.add(jrRectangle);
		shapesGroup.add(jrRectangle);
		
		jrSquare.addActionListener(this);
		shapegroupPanel.add(jrSquare);
		shapesGroup.add(jrSquare);
		
		jrNoShape.addActionListener(this);
		shapegroupPanel.add(jrNoShape);
		shapesGroup.add(jrNoShape);
		
		shapegroupPanel.setPreferredSize(new Dimension(100,400));
		
		jbCircleColor.addActionListener(this);
		jbCircleColor.setBackground(Color.WHITE);
		jbCircleColor.setOpaque(true);

		jbRectColor.addActionListener(this);
		jbRectColor.setBackground(Color.WHITE);
		jbRectColor.setOpaque(true);
		
		jbSquareColor.addActionListener(this);
		jbSquareColor.setBackground(Color.WHITE);
		jbSquareColor.setOpaque(true);

		add(jbCircleColor);
		add(jbRectColor);
		add(jbSquareColor);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		

		if(e.getActionCommand() == "Circle")
		{
			CenterPanel.setShapeStatus(true);
			
			
		}else
			CenterPanel.setShapeStatus(false);


		if(e.getActionCommand() == "Rectangel" )
		{
			CenterPanel.setRectangleStatus(true);
			
		}else
			CenterPanel.setRectangleStatus(false);
		
		if(e.getActionCommand() == "Square" )
		{
			CenterPanel.setSquareStatus(true);
			
		}else{
			CenterPanel.setSquareStatus(false);
		}
	
		
		// Action Event when the shapes color is pressed the button color status change too 
		if(e.getActionCommand().equalsIgnoreCase("Circle Color"))
		{
			CenterPanel.setCircleColor(JColorChooser.showDialog(this,"Circle Color ",(CenterPanel.getCircleColor())));
			jbCircleColor.setBackground(CenterPanel.getCircleColor());
		}
		
		if (e.getActionCommand().equalsIgnoreCase("Rect Color"))
		{
			CenterPanel.setRectColor(JColorChooser.showDialog(this,"Rect Color ",(CenterPanel.getRectangleColor())));
			jbRectColor.setBackground(CenterPanel.getRectangleColor());
		}
		
		
		if (e.getActionCommand().equalsIgnoreCase("Square Color"))
		{
			CenterPanel.setSquareColor(JColorChooser.showDialog(this,"Square Color ",(CenterPanel.getSquareColor())));
			jbSquareColor.setBackground(CenterPanel.getSquareColor());
		}

	}
}





