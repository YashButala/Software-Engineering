import javax.swing.*;
import java.awt.*;
public class Gui {
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Login Example");	
		
		
		JButton b=new JButton("Login");
		b.setBounds(50,250,100, 40);
		f.add(b);
		
		JButton b1=new JButton("Clear");
		b1.setBounds(250,250,100, 40);
		f.add(b1);
		
		
		JLabel l1=new JLabel("Username");
		l1.setBounds(50, 80, 100, 40);
		f.add(l1);
		
		
		JTextField a1=new JTextField();
		a1.setBounds(200 ,80,150,40);
		f.add(a1);
		
		JLabel l=new JLabel("Password");
		l.setBounds(50, 140, 100, 40);
		f.add(l);
		

		JPasswordField a2=new JPasswordField();
		a2.setBounds(200 ,140,150,40);
		f.add(a2);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}



