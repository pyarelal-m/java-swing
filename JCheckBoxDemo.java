import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="JCheckBoxDemo" width=200 height=200>
</applet>*/

public class JCheckBoxDemo extends JApplet implements ItemListener
{
	
	JTextField jtf;
	Container cp;
	public void init()
	{
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
	
		//Create icons
	ImageIcon normal=new ImageIcon("slideshow.gif");
	ImageIcon rollover=new  ImageIcon("handtool.gif");
	ImageIcon selected=new  ImageIcon("hwa_12.gif");

		//Add checkboxes to cp
		JCheckBox cb=new JCheckBox("C");
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		cp.add(cb);

		cb=new JCheckBox("C++",normal);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		cp.add(cb);

		cb=new JCheckBox("Pearl",normal);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		cp.add(cb);
		
		jtf=new JTextField(15);
		cp.add(jtf);
	}
	
	public void itemStateChanged(ItemEvent ie)		
	{
		JCheckBox cb=(JCheckBox)ie.getItem();
		jtf.setText(cb.getText());
	}
}