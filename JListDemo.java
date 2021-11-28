import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/*<applet code="JListDemo" width=400 height=200></applet>*/
public class JListDemo extends JApplet implements ListSelectionListener
{
	JList jl;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		String items[]=new String[12];
		for(int i=0; i<12; i++)
		{
			items[i]="Item" + i;
		}
		jl=new JList(items);
		JScrollPane jsp=new JScrollPane(jl);
		jl.setVisibleRowCount(5);
		jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jl.addListSelectionListener(this);
		cp.add(jsp);
	}

	public void valueChanged(ListSelectionEvent e)
	{
		int[] indexes=jl.getSelectedIndices();
		String s="U choose:";
		for(int i=0; i<indexes.length;i++)
		{
			s+="item" +indexes[i];
		}
		showStatus(s);
	}
}
