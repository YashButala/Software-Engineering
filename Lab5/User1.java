import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class User1 extends JFrame implements ActionListener
{
        JTextField txtfield;
        JTextArea txtarea;
        byte[] serverbffr,clientbffr;
        String senddata;
        DatagramSocket client,server;
        JButton button1;
	InetAddress IPAddress,IPAddress2;

        User1()
        {       
                this.setSize(400,500);
                this.setTitle("USER1");
                this.setBackground(Color.black);
                txtfield=new JTextField();
                txtfield.setBackground(Color.white);
                txtfield.setForeground(Color.blue);
                this.add(txtfield,BorderLayout.NORTH);
                txtarea=new JTextArea();
                txtarea.setBackground(Color.black);
                txtarea.setForeground(Color.green);
                this.add(txtarea,BorderLayout.CENTER);
                button1=new JButton("SEND");
                this.add(button1,BorderLayout.SOUTH);
                button1.addActionListener(this);
                this.setVisible(true);
                serverbffr=new byte[1024];
                clientbffr=new byte[1024];
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

                try
                {
                	IPAddress = InetAddress.getByName("117.232.218.164");
                	IPAddress2 = InetAddress.getByName("0.0.0.0");
                        client=new DatagramSocket();
                        server=new DatagramSocket(9998,IPAddress2);
                        while(true)
                        {
                                        DatagramPacket datapack=new DatagramPacket(serverbffr,serverbffr.length);
                                        server.receive(datapack);
                                        String msg=new String(datapack.getData());
                                        txtarea.append("\nServer:"+msg);
                        }       
                }

                catch(Exception e){}   

        }

        public void actionPerformed(ActionEvent e)
        {
                try
                {
                        if(e.getActionCommand()=="SEND")
                        {
                                String message=txtfield.getText();
                                clientbffr=message.getBytes();
                                DatagramPacket sendpack=new
				DatagramPacket(clientbffr,clientbffr.length,IPAddress,9999);
                                client.send(sendpack);
                                txtarea.append("\nMyself:"+message);
                                txtfield.setText("");
                        }
                }
                catch(Exception a){}
        }
        public static void main(String []args)
        {
                new User1();
        }

}
