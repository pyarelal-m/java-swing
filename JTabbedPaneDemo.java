import javax.swing.*;
/* <applet code = "JTabbedPaneDemo" width=400 height=100>
   </applet>*/
public class JTabbedPaneDemo extends JApplet
{
	public void init()
	{
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colours", new ColoursPanel());
		jtp.addTab("Flavours", new FlavoursPanel());
		getContentPane().add(jtp);
	}
}

class CitiesPanel extends JPanel
{
	public CitiesPanel()
	{
		JButton b1=new JButton("New York");
		add(b1);
		JButton b2=new JButton("London");
		add(b2);
		JButton b3=new JButton("Hongkong");
		add(b3);
		JButton b4=new JButton("Tokyo");
		add(b4);
	}
}

class ColoursPanel extends JPanel
{
	public ColoursPanel()
	{
		JCheckBox cb1=new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2=new JCheckBox("Green");
		add(cb2);	
		JCheckBox cb3=new JCheckBox("Blue");
		add(cb3);
	}
}

class FlavoursPanel extends JPanel
{
	public FlavoursPanel()
	{
		JComboBox jcb=new JComboBox();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		add(jcb);
	}
}