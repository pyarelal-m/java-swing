import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
/* <applet code="JProgressDemo" width=400 height=300></applet> */
public class JProgressDemo extends JApplet implements ActionListener
{
	JProgressBar jp=new JProgressBar();
	JButton jb=new JButton("Increment ProgressBar");
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jb);
		cp.add(jp);
		jp.setForeground(Color.blue);
		jb.addActionListener(this);
		jp.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				showStatus("Progress bar minimum" +jp.getMinimum() +"Progress bar Maximum" +jp.getMaximum() +"Value" +jp.getValue());
			}
		});
	}
	public void actionPerformed (ActionEvent ae)
	{
		try
		{
		int i;
		for(i=jp.getMinimum();i<jp.getMaximum();i++)
		{
		Thread.sleep(500);
		jp.setValue(jp.getValue()+1);
		}	
		}
		catch(Exception ex)
		{
			
		}
	}
}