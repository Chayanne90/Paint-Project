

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CenterPanel extends JPanel implements MouseListener, MouseMotionListener
{
	
	// Creating the Shape
	
	private static boolean circleStatus  = false; 
	private static boolean rectangleStatus = false;
	private static boolean squareStatus = false;
	private static Color circleColor = Color.BLACK; 
	private static Color rectColor = Color.BLACK; 
	private static Color squareColor = Color.BLACK; 
	private static Color boardColor = Color.LIGHT_GRAY;
	private static int Circlesize = 10;
	private static int Rectanglesize = 10;
	private static int Squaresize = 10;
	protected int lastX=0, lastY=0; 
	private static Color PenColor;
	private static int PenSize;

	
	
	public CenterPanel()
	{
		
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(boardColor);
		
		
	}
	
	/*Setters and Getters for the shapes, pen, and colors */
	
	// Circle color

	public static void setCircleColor(Color c)
	{
		circleColor = c; 

	}
	
	public static Color getCircleColor()
	{

		return circleColor; 
	}
	
	
	
	//Rectangle color
	
	public static void setRectColor(Color c)
	{
		rectColor = c;
	}
	
	public static Color getRectangleColor()
	{
		return rectColor;
	}
	
	// Square color
	
	public static void setSquareColor(Color c)
	{
		squareColor = c;
		
	}
	
	public static Color getSquareColor()
	{
		return squareColor;
	}
	
	//pen color
	public static void setPenColor(Color c)
	{
		PenColor = c;
	}

	public static Color getPenColor()
	{
		return PenColor;

	}
	
	// Pen 
	public void record(int x, int y)
	{
		lastX=x; 
		lastY=y; 
	}
	
	// Shape  status ON and OFF
	public static void setRectangleStatus(boolean b)
	{
		rectangleStatus = b;
		
	}
	
	public static boolean getRectangelStatus()
	{
		return rectangleStatus;
	}
	
	public static void setSquareStatus(boolean b)
	{
		squareStatus = b;
		
	}
	
	public static boolean getSquareStatus()
	{
		return squareStatus;
	}
	

	public static void setShapeStatus(boolean b)
	{
		circleStatus = b; 

	}
	public static boolean getDrawShapesStatus()
	{

		return circleStatus; 
	}
	// End of shapes status.
	


	// Pen Size 
	public static int setPenSize(int s)
	{
		return PenSize = s;


	}

	public static int getPenSize()
	{
		return PenSize;

	}

	
	// Center Panel color
	
	public static void setbackground(Color c)
	{
		boardColor = c;
		
		
	}
	
	public  Color getBackground()
	{
		return boardColor;
	}
	
	
	// Shape size  Setters and Getters!
	
	public static void setCircleSize(int s)
	{
		Circlesize= s; 

	}
	
	public static int getCircleSize()
	{
		return Circlesize; 	
	}
	
	public static void setRectangleSize(int s)
	{
		Rectanglesize = s;
	}
	
	public static int getRectangleSize()
	{
		return Rectanglesize;
	}
	
	public static void setSquareSize(int s)
	{
		Squaresize = s;
	}
	
	public static int getSquareSize()
	{
		return Squaresize;
	}
	// end shape setters and getters
	
	

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		

	}
	
	//mouse event when the shapes mouse is pressed.

	@Override
	public void mousePressed(MouseEvent e) 
	{
		int x=e.getX();
		int y= e.getY();
		record(x,y);
		
		if (circleStatus)
		{
			
			Graphics g= getGraphics(); 
			g.setColor(circleColor);
			g.fillOval(e.getX() - Circlesize, e.getY() - Circlesize,2* Circlesize, 2 * Circlesize);
			
		}
		
		if (rectangleStatus)
		{
			Graphics g= getGraphics(); 
			g.setColor(rectColor);
			g.fillRect(e.getX() - Rectanglesize, e.getY() - Rectanglesize,4* Rectanglesize, 2 * Rectanglesize);
			
		}
		
		if (squareStatus)
		{
			
			Graphics g= getGraphics(); 
			g.setColor(squareColor);
			g.fillRect(e.getX() - Squaresize, e.getY() - Squaresize,2* Squaresize, 2 * Squaresize);
			
		}

	}// End mouse event

	@Override
	public void mouseReleased(MouseEvent e) 
	{

	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		requestFocus();
		record(e.getX(),e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		

	}
	
	// Mouse event when the mouse is pressed and Dragged 

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		//g.setColor(getPenColor());  //using g2d instead so we can set the line thickness
		Graphics2D g2d = (Graphics2D) g;  //cast the Graphics object to Graphics2D for that purpose
		g2d.setColor(getPenColor());
		g2d.setStroke(new BasicStroke(getPenSize())); //used to set the thickness
		g2d.drawLine(lastX, lastY, x, y);
		//g.drawLine(lastX, lastY, x, y);  //using g2d instead so we can control the line thickness
		record(x,y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	

}
