import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="JComboBoxDemo" width=200 height=200>
</applet>*/

public class JComboBoxDemo extends JApplet implements ItemListener
{
	JLabel jl;
	//ImageIcon fra,ger,ita,jpn;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());

		//fra=new ImageIcon("slideshow.gif");
		//ger=new ImageIcon("hwa_12.gif");
	
		//Add Combo Box to cp
		JComboBox jc=new JComboBox();
		jc.addItem("slideshow");
		jc.addItem("hwa_12");
		jc.addItem("handtool");

		jc.addItemListener(this);
		cp.add(jc);

		jl=new JLabel(new ImageIcon("print.gif"));
		cp.add(jl);
		
	}
	
	public void itemStateChanged(ItemEvent ie)		
	{
		String s=(String)ie.getItem();
		ImageIcon i=new ImageIcon(s+".gif");
		jl.setIcon(i);
	}
}