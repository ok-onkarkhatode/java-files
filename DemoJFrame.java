import java.awt.*;
import javax.swing.JFrame;

class DemoJFrame
{
  public static void main(String args[])
  {
    JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocation(500,100);
	frame.setTitle("Login Page");
	frame.getContentPane().setBackground(Color.BLUE);
  }
}