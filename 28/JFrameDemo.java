import javax.swing.*;

class JFrameDemo 

{

public JFrameDemo()

{

JFrame f = new JFrame("Demo Frame");

f.setVisible(true);

f.setSize(300,300);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main(String args[])

{

JFrameDemo obj = new JFrameDemo();

}

}