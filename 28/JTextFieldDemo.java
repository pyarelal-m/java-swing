import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class JTextFieldDemo implements FocusListener

{

JTextField jtf1,jtf2;

public JTextFieldDemo()

{

JFrame jfrm = new JFrame("JTextField");

jfrm.setLayout(new FlowLayout());

jfrm.setVisible(true);

jfrm.setSize(500,500);

jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jtf1 = new JTextField ("Enter Text First");

jtf2 = new JTextField ("Now Click Here");

jfrm.add(jtf1);

jfrm.add(jtf2);

jtf1.addFocusListener(this);

}

public void focusLost(FocusEvent fe)

{

String temp;

temp=jtf1.getText();

jtf2.setText(temp);

}

public void focusGained(FocusEvent fe)

{

jtf1.setText("");

}

public static void main(String args[])

{

JTextFieldDemo obj = new JTextFieldDemo();

}

}
