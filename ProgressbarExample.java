import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="ProgressbarExample" height=200 width=300></applet>
*/

public class ProgressbarExample extends JApplet implements ActionListener
{
	JProgressBar pg;
	Timer tm;
	JButton btn;
	
    public void init() 
    {
	Container contentPane = getContentPane();
	contentPane.setLayout(new FlowLayout());
    	pg=new JProgressBar();
    	pg.setValue(0);
    	
		pg.setStringPainted(true);
    	
    	tm=new Timer(1000,null);
    	
	btn=new JButton("Start");

	contentPane.add(pg);
	contentPane.add(btn);
    	
    	btn.addActionListener(this);
    	tm.addActionListener(this);
    	 	
    	//setSize(200,300);
    	//setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==btn)
    	{
    		pg.setValue(0);
    		tm.start();
    	}
    	else if(e.getSource()==tm)
    	{
    		pg.setValue(pg.getValue()+1);
    		pg.setString("Work in progress : "+pg.getValue() + "%");
    		
    		if(pg.getValue()==100)
    		{
    			tm.stop();
    			JOptionPane.showMessageDialog(this,"Work is Completed");
    		}
    	}
    }
    
  /*  public static void main(String args[])
    {
    	ProgressbarExample frm=new ProgressbarExample();
    }*/
    
}