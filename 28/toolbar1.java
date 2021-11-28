import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/*
<APPLET CODE ="toolbar1.class" WIDTH = 350 HEIGHT = 280 >
</APPLET>
*/
public class toolbar1 extends JApplet implements ActionListener
{
	
	JToolBar jtoolbar,setrollover;
	JButton btnNew,btnOpen, btnSave,btnsetroll;

    public void init() 
    {
    	
	jtoolbar=new JToolBar();
	setrollover=new JToolBar();

    	btnNew=new JButton("New",new ImageIcon("new.png"));
    	btnOpen=new JButton("Open",new ImageIcon("Open.png"));
    	btnSave=new JButton("Save",new ImageIcon("Save.png"));
    	btnsetroll=new JButton("Set Rollover");

    	btnNew.setToolTipText("New");
    	btnOpen.setToolTipText("Open");
    	btnSave.setToolTipText("Save");
	btnsetroll.setToolTipText("Set Rollover ToolTip");

    		
    	btnNew.addActionListener(this);
    	btnOpen.addActionListener(this);
    	btnSave.addActionListener(this);
	btnsetroll.addActionListener(this);
    	
    	jtoolbar.add(btnNew);
	jtoolbar.addSeparator();
    	jtoolbar.add(btnOpen);
	jtoolbar.addSeparator();
    	jtoolbar.add(btnSave);

	setrollover.add(btnsetroll);

    	Container content1=getContentPane();
	content1.setLayout(new BorderLayout());
    	
    	content1.add(jtoolbar,"North");
	content1.add(setrollover,"South");
    	
   	jtoolbar.setFloatable(false);// set toolbar can be made float
	jtoolbar.setRollover(false);//set rollover state of toolbar
	    		
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(jtoolbar.isRollover())
	{
		if(e.getSource()==btnNew)
		showStatus("You clicked New Button");	
		else if (e.getSource()==btnOpen)
		showStatus("You clicked Open Button");
		else if (e.getSource()==btnSave)
		showStatus("You clicked Save Button");
	}
	else
	{
		showStatus("Rollover is not set ! SET THE ROLLOVER FIRST");
	}
	
	if(e.getSource()==btnsetroll)
	{
		jtoolbar.setRollover(true);
		jtoolbar.setFloatable(true);
		showStatus("Setting Rollover Successful");
	}
    }
    
   	   
}
