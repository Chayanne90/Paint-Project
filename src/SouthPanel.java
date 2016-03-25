
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SouthPanel extends JPanel implements ActionListener
{
	
	
	private JLabel jl = new JLabel();
	private JButton jb = new JButton();
	
	JPanel sizeGroupPanel = new JPanel();
	ButtonGroup sizes = new ButtonGroup();

	// scroll down for the size of the Shapes and Pen. 
	private JComboBox Penbox;
	private JComboBox CircleBox;
	private JComboBox Rectbox;
	private JComboBox SquareBox;
	private JComboBox FontSizeBox;
	private  String [] choosepensize = {"Pen","10","15","20","25","30"};
	private  String [] chooseCirclesize = {"Circle","15","25","30","35","40"};
	private  String [] chooseRectanglesize = {"Rectangle","10","15","20","25","30"};
	private  String [] chooseSquaresize = {"Square","10","15","20","25","30"};
	private  String [] chooseFontSize = {"Font","11", "12" , "13", "14", "15" ,"20"};
	
	
	public SouthPanel()
	{
		
		setBackground(Color.LIGHT_GRAY);
		sizeGroupPanel.setBorder(BorderFactory.createTitledBorder("Size"));
		sizeGroupPanel.setBackground(Color.LIGHT_GRAY);
		add(sizeGroupPanel);
		
		Penbox = new JComboBox(choosepensize);
		Penbox.addActionListener(this);
		sizeGroupPanel.add(jl);
		sizeGroupPanel.add(Penbox);
		
		CircleBox = new JComboBox(chooseCirclesize);
		CircleBox.addActionListener(this);
		sizeGroupPanel.add(jl);
		sizeGroupPanel.add(CircleBox);
		
		Rectbox = new JComboBox(chooseRectanglesize);
		Rectbox.addActionListener(this);
		sizeGroupPanel.add(jl);
		sizeGroupPanel.add(Rectbox);
		
		SquareBox = new JComboBox(chooseSquaresize);
		SquareBox.addActionListener(this);
		sizeGroupPanel.add(jl);
		sizeGroupPanel.add(SquareBox);
	
	}

	// Action Listener for the event when the size of the shpae are selected.
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// Selecting  from the PenBox 
		if (Penbox.getSelectedItem() == "5")
		{
			CenterPanel.setPenSize(10);

		}
		if (Penbox.getSelectedItem() == "10")
		{
			CenterPanel.setPenSize(15);

		}
		if (Penbox.getSelectedItem() == "15")
		{
			CenterPanel.setPenSize(20);

		}
		if (Penbox.getSelectedItem() == "20")
		{
			CenterPanel.setPenSize(25);

		}
		if (Penbox.getSelectedItem() == "30")
		{
			CenterPanel.setPenSize(30);

		}// end Combo box
		
		
		//Selecting Circle Size
		
		if (CircleBox.getSelectedItem() == "10")
		{
			CenterPanel.setCircleSize(10);

		}
		if (CircleBox.getSelectedItem() == "15")
		{
			CenterPanel.setCircleSize(15);

		}
		if (CircleBox.getSelectedItem() == "20")
		{
			CenterPanel.setCircleSize(20);

		}
		if (CircleBox.getSelectedItem() == "25")
		{
			CenterPanel.setCircleSize(25);

		}
		if (CircleBox.getSelectedItem() == "30")
		{
			CenterPanel.setCircleSize(30);

		}// end circle Size 

		// selecting Rectangle Size
		
		if (Rectbox.getSelectedItem() == "10")
		{
			CenterPanel.setRectangleSize(10);;

		}
		if (Rectbox.getSelectedItem() == "15")
		{
			CenterPanel.setRectangleSize(15);

		}
		if (Rectbox.getSelectedItem() == "20")
		{
			CenterPanel.setRectangleSize(20);

		}
		if (Rectbox.getSelectedItem() == "25")
		{
			CenterPanel.setRectangleSize(25);

		}
		if (Rectbox.getSelectedItem() == "30")
		{
			CenterPanel.setRectangleSize(30);

		}// end Rectangle Size
		
		

		
		// Selecting Square Size
		if (SquareBox.getSelectedItem() == "10")
		{
			CenterPanel.setSquareSize(10);

		}
		if (SquareBox.getSelectedItem() == "15")
		{
			CenterPanel.setSquareSize(15);

		}
		if (SquareBox.getSelectedItem() == "20")
		{
			CenterPanel.setSquareSize(20);

		}
		if (SquareBox.getSelectedItem() == "25")
		{
			CenterPanel.setSquareSize(25);

		}
		if (SquareBox.getSelectedItem() == "30")
		{
			CenterPanel.setSquareSize(30);

		} // end Square Size
		

	} // End Action Listener

}
