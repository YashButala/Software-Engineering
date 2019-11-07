import javax.swing.*;
public class SwingOptionPane
{
	 JFrame f;
	 SwingOptionPane()
	 {
	 	 f=new JFrame();
	 	 JOptionPane.showMessageDialog(f,"Hello,Welcome to Swing");
	 }
	 public static void main(String args[])
	 {
	 	 new SwingOptionPane();
	 }
}