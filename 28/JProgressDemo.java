import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class JProgressDemo {

  private JFrame mainFrame;
  private JLabel headLabel;
  private JLabel msgLabel;
  private JPanel mainPanel;
  private JProgressBar jProgress;

  public JProgressDemo() {
    mainFrame = new JFrame("Java Swing Examples");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));

    headLabel = new JLabel("Progress Bar", JLabel.CENTER);
    msgLabel = new JLabel("No Progress", JLabel.CENTER);
    mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());

    mainFrame.add(headLabel);
    mainFrame.add(mainPanel);
    mainFrame.add(msgLabel);
    mainFrame.setVisible(true);
  }

  public static void main(String[] args) {
    JProgressDemo demo = new JProgressDemo();
    demo.showButtonDemo();
    demo.iterate();
  }

  private void showButtonDemo() {

    jProgress = new JProgressBar(0, 100);
    jProgress.setBounds(10, 10, 300, 15);
    jProgress.setValue(0);
    jProgress.setStringPainted(true);

    mainPanel.add(jProgress);
    mainFrame.setVisible(true);
  }

  public void iterate() {
    int i = 0;
    while (i <= 100) {
      jProgress.setValue(i);
      String valText = 
          Integer.toString(jProgress.getValue());
      i = i + 1;
      try {
        msgLabel.setText("Progress : " + valText);
        Thread.sleep(150);
      } catch (Exception e) {
      }
    }
  }
}
