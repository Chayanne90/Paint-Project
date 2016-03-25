
import java.awt.Color; 
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TypingAndDrawing extends CenterPanel implements KeyListener{
	
	private FontMetrics fm;
	private static int fontSize = 20;
	Font font  = new Font("Serif", Font.BOLD,fontSize);
	private static Color fontColor;
	
	
	public static void setFontColor(Color c)
	{
		fontColor = c;
	}
	
	public static Color getFontColor()
	{
		return fontColor;
	}

	public TypingAndDrawing(){
		super();
		setLayout(null);
		setFont(font);
		fm = getFontMetrics(font);
		addKeyListener(this);
		
	}
	
	// Key Event when the mouse its click the Center Panel response to the keyboard Listener
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//ystem.out.println("inside keyType");
		String s =String.valueOf(e.getKeyChar());
		
		System.out.println("String is " + s);
		Graphics g = getGraphics();
		g.setColor(fontColor); 
		//g.setFont(fontSize);
		g.drawString(s, lastX, lastY);
		record(lastX + fm.stringWidth(s),lastY);
		
		System.out.println("last coodrs " + lastX + "," + lastY);
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
