import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/* <applet code="JToolTipDemo" width=400 height=200></applet>*/
public class JToolTipDemo extends JApplet
{
	JButton jb=new JButton("ClickMe");
	JTextField jtf=new JTextField(20);
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout (new FlowLayout());
		jb.setToolTipText("This is button");
		jtf.setToolTipText("This is my TextBox");
		cp.add(jb);
		cp.add(jtf);
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
			jtf.setText("Hello from Swing");
			}
		});
	}	
}