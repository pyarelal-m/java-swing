import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="JRadioButtonDemo" width=200 height=200>
</applet>*/

public class JRadioButtonDemo extends JApplet implements ActionListener
{
	JTextField jtf;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
	
		//Add Radio Buttons to cp
		JRadioButton b1=new JRadioButton("A");
		b1.addActionListener(this);
		cp.add(b1);

		JRadioButton b2=new JRadioButton("B");
		b2.addActionListener(this);
		cp.add(b2);

	JRadioButton b3=new JRadioButton("C",true);
		b3.addActionListener(this);
		cp.add(b3);

		//Define Button Group
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		jtf=new JTextField(5);
		cp.add(jtf);
	}
	
	public void actionPerformed(ActionEvent ae)		
	{
		jtf.setText(ae.getActionCommand());
	}
}