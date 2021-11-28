import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class JPasswordFieldDemo {

  private JFrame mainFrame;
  private JLabel headLabel;
  private JLabel msgLabel;
  private JPanel mainPanel;

  public JPasswordFieldDemo() {
    mainFrame = new JFrame("Java Swing Examples");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    headLabel = new JLabel("Password Demo", JLabel.CENTER);
    msgLabel = new JLabel("Blank Password", JLabel.CENTER);
    mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());

    mainFrame.add(headLabel);
    mainFrame.add(mainPanel);
    mainFrame.add(msgLabel);
    mainFrame.setVisible(true);
  }

  public static void main(String[] args) {
    JPasswordFieldDemo demo = new JPasswordFieldDemo();
    demo.showListDemo();
  }

  private void showListDemo() {

    JLabel lblPassword = new 
          JLabel("Password : ", JLabel.RIGHT);
   final JPasswordField txtPassword = new JPasswordField(8);

    JButton btnDisplay = new JButton("Show Password");

    btnDisplay.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String pwd = new String(txtPassword.getPassword());
        msgLabel.setText("Password : " + pwd);
      }
    });

    mainPanel.add(lblPassword);
    mainPanel.add(txtPassword);
    mainPanel.add(btnDisplay);
    mainFrame.setVisible(true);
  }
}
