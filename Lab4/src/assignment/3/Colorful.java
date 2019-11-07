import java.applet.*;
import java.awt.*;
public class Colorful extends Applet implements Runnable
{
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
		if(counter==0)
		{
			g.setColor(Color.blue);
			
			counter=1;
		}
		else if(counter==1)
		{
			g.setColor(Color.red);
		
			counter=0;
		}
		g.drawString("BE THE CHANGE YOU WISH TO BE",20,20);	

	}
}