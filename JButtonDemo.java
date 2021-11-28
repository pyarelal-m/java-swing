import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="JButtonDemo" width=200 height=200>
</applet>*/

public class JButtonDemo extends JApplet implements ActionListener
{
	JTextField jtf;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		//cp.setBackground(Color.YELLOW);			

		//Add  Buttons to cp
	ImageIcon ico=new ImageIcon("handtool.gif");
		
	JButton b1=new JButton("HandTool",ico);
		
		b1.addActionListener(this);
		b1.setActionCommand("Germany");
		b1.setBackground(Color.BLUE);
		cp.add(b1);

		JButton b2=new JButton("Slide",ico);
		b2.addActionListener(this);
		cp.add(b2);

		JButton b3=new JButton("Common");
		b3.addActionListener(this);
	b3.setActionCommand("This button is common");
		cp.add(b3);
		
		
		jtf=new JTextField(25);
		cp.add(jtf);
	}
	
	public void actionPerformed(ActionEvent ae)		
	{
		jtf.setText(ae.getActionCommand());
	}
}