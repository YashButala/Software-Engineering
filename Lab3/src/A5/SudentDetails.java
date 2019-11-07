import javax.swing.*;
import java.awt.*;
public class SudentDetails {
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Student Details");	
		
		String [][] Data={
				{"17CS30038","Yash","90"},{"17CS10061","Rajat","94"},{"17CS10060","Aditya","95"}
		};
		String[] column = { "Roll No", "Name", "Marks" };
		  
        	JTable j = new JTable( Data , column);  //creates table containing data with coloumn as headers
        	j.setBounds(30, 40, 200, 300); 
		f.add(j);

	    JScrollPane sp = new JScrollPane(j);
	    f.add(sp); 
		f.setSize(460,600);
	//	f.setLayout(null);
		f.setVisible(true);
	}
}
