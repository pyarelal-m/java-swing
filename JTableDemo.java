import java.awt.*;
import javax.swing.*;

/*<applet code = "JTableDemo" width=400 height=200></applet>*/

public class JTableDemo extends JApplet
	{
	public void init()
	{
	Container ContentPane = getContentPane();
	ContentPane.setLayout (new BorderLayout());

	// Initialize column headings
	final String[] colHeads={"Name","Phone","Fax"};

	// Initialize Data
	final Object[][] data = {
		  	{"Gail","4567","8678"},
		  	{"Ken","1234","5689"},
		  	{"Helen","3456","1347"},
			};
	//Create the table
	JTable table = new JTable(data,colHeads);
	table.setToolTipText("This is TABLE" );
	//Add table to ScrollPane
	int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

	JScrollPane jsp = new JScrollPane(table,v,h);

	//Add scroll pane to content pane
	ContentPane.add(jsp,BorderLayout.CENTER);
	}
}