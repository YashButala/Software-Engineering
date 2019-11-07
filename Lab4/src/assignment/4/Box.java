import java.applet.*;
import java.awt.*;
public class Box extends Applet implements Runnable
{
	 Font theFont = new Font("TimesRoman",Font.BOLD,24);
	int counter=0;
	Thread runner;
	public void start() 
	{
		if (runner == null) 
		{
			runner = new Thread(this);
			runner.start();
		}
	}
	public void stop() 
	{
		if (runner != null) 
		{
			runner.stop();
			runner = null;
		}
	}
	public void run() 
	{
	     while (true) 
	     {
	    	 try {
	    		 Thread.currentThread();
	    		 Thread.sleep(1000); }
	    	 catch (InterruptedException e) { }
	    	 repaint();
	     }
	}
	public void paint(Graphics g)
	{
		if(counter%4==1||counter%4==3)
			g.setColor(Color.cyan);
		else
			g.setColor(Color.red);
		if(counter%2==0)
		{
			
			g.fillRect(20, 20, 200, 100);
			g.setColor(Color.black);
			g.setFont(theFont);
			g.drawString("yash butala",20,40);	
			
		}
		else 		
		{
			g.setColor(Color.red);
			g.fillRect(120, 20, 200, 100);
			g.setColor(Color.black);
			g.setFont(theFont);
			g.drawString("yash butala",120,40);	
		}
		counter++;
		

	}
}
