import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/*
<APPLET CODE ="wordpad.class" WIDTH = 350 HEIGHT = 280 >
</APPLET>
*/
public class wordpad extends JApplet implements ActionListener
{
	JMenuBar jmenubar;
	JMenu  fileMenu, editMenu,helpMenu;
	JMenuItem newMenuItem,openMenuItem,
	saveMenuItem, exitMenuItem, undoMenuItem, 
	cutMenuItem,copyMenuItem, pasteMenuItem, 
	aboutMenuItem,colorMenuItem;
	
	JEditorPane editor;
	JToolBar toolbar;
	JButton btnNew,btnOpen, btnSave;

    public void init() 
    {
    	    	
    	jmenubar=new JMenuBar();

	editor=new  JEditorPane();
    	JScrollPane scroll=new JScrollPane(editor);
    	scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	toolbar=new JToolBar();
    	btnNew=new JButton("New",new ImageIcon("new.png"));
    	btnOpen=new JButton("",new ImageIcon("Open.png"));
    	btnSave=new JButton("",new ImageIcon("Save.png"));
    	
    	btnNew.setToolTipText("New");
    	btnOpen.setToolTipText("Open");
    	btnSave.setToolTipText("Save");
    		
    	btnNew.addActionListener(this);
    	btnOpen.addActionListener(this);
    	btnSave.addActionListener(this);
    	
    	toolbar.add(btnNew);
    	toolbar.add(btnOpen);
    	toolbar.add(btnSave);

    	fileMenu=new JMenu("File");
    	editMenu=new JMenu("Edit");
    	helpMenu=new JMenu("Help");
    	
    	newMenuItem=new JMenuItem("New");
    	openMenuItem=new JMenuItem("Open");
    	saveMenuItem=new JMenuItem("Save");
    	exitMenuItem=new JMenuItem("Exit");
    	undoMenuItem=new JMenuItem("Undo");
    	cutMenuItem=new JMenuItem("Cut");
    	copyMenuItem=new JMenuItem("Copy");
    	pasteMenuItem=new JMenuItem("Paste");
    	aboutMenuItem=new JMenuItem("About");
    	colorMenuItem=new JMenuItem("Color");
    	
    	fileMenu.add(newMenuItem);
    	fileMenu.add(openMenuItem);
    	fileMenu.add(saveMenuItem);
    	fileMenu.add(exitMenuItem);
    	
    	
    	
    	editMenu.add(undoMenuItem);
    	editMenu.add(cutMenuItem);
    	editMenu.add(copyMenuItem);
    	editMenu.add(pasteMenuItem);
    	editMenu.add(colorMenuItem);
    	
    	
    	helpMenu.add(aboutMenuItem);

	
	newMenuItem.setActionCommand("You have selected New");
    	openMenuItem.setActionCommand("You have selected Open");
    	saveMenuItem.setActionCommand("You have selected Save");
    	exitMenuItem.setActionCommand("You have selected Exit");
	
	undoMenuItem.setActionCommand("You have selected Undo");
    	cutMenuItem.setActionCommand("You have selected Cut");
    	copyMenuItem.setActionCommand("You have selected Copy");
    	pasteMenuItem.setActionCommand("You have selected Paste");
    	colorMenuItem.setActionCommand("You have selected Color");
    	
	aboutMenuItem.setActionCommand("You have selected Help");


    	
    	newMenuItem.addActionListener(this);
    	openMenuItem.addActionListener(this);
    	saveMenuItem.addActionListener(this);
    	exitMenuItem.addActionListener(this);
    	cutMenuItem.addActionListener(this);
    	copyMenuItem.addActionListener(this);
    	pasteMenuItem.addActionListener(this);
    	undoMenuItem.addActionListener(this);
    	colorMenuItem.addActionListener(this);
    	aboutMenuItem.addActionListener(this);
    	
    	//Container content=getContentPane();
	//content.setLayout(new BorderLayout());
    	
	jmenubar.add(fileMenu);
	jmenubar.add(editMenu);
    	jmenubar.add(helpMenu);
	
	Container content1=getContentPane();
	content1.setLayout(new BorderLayout());
    	
    	content1.add(toolbar,"North");
    	content1.add(scroll,"Center");
   	
	setJMenuBar(jmenubar);
	   	
    		
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==aboutMenuItem)
    	{
    		JOptionPane.showMessageDialog(this,"This is a simple example of JMenu");
    	}
    	else if(e.getSource()==newMenuItem  || e.getSource()==btnNew)
    	{
    		editor.setText("");
    	}
    	else if(e.getSource()==openMenuItem  || e.getSource()==btnOpen)
    	{
    		try
    		{
    			JFileChooser open=new JFileChooser();
    			open.showOpenDialog(this);    		
    			editor.setPage("file:///" + open.getSelectedFile().getAbsolutePath());
    			JOptionPane.showMessageDialog(this,open.getSelectedFile().getAbsolutePath());
    		}
    		catch(Exception ex)
    		{
    			JOptionPane.showMessageDialog(this,ex.getMessage());
    		}
    	}
    	
    	else if(e.getSource()==saveMenuItem  || e.getSource()==btnSave)
    	{
    		try
    		{
    			
    			JFileChooser save=new JFileChooser();
    			save.showSaveDialog(this);    		
    		
    		}
    		catch(Exception ex)
    		{
    			JOptionPane.showMessageDialog(this,ex.getMessage());
    		}
    	}
    	
    	else if(e.getSource()==cutMenuItem)
    	{
    		editor.cut();

    	}
    	
    	else if(e.getSource()==copyMenuItem)
    	{
    		editor.copy();

    	}
    	
    	else if(e.getSource()==pasteMenuItem)
    	{
    		editor.paste();

    	}
    	else if(e.getSource()==colorMenuItem)
    	{
    		Color color=JColorChooser.showDialog(this,"Select Color",Color.black);
    		//editor.setBackground(color);    
    		editor.setForeground(color);
    				
    	}
    	else if(e.getSource()==exitMenuItem)
    	{
    		System.exit(0);
    	}
    }
    
   	   
}
