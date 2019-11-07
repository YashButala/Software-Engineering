import java.applet.*;
import java.awt.*;
public class Checker extends Applet{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);//sets black color
		g.fillRect(0, 0, 160, 160);
		g.setColor(Color.red);//color change to red if i+j is even which will form checkers
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i+j)%2==0)
				{
					g.fillRect(i*20, j*20, 20, 20);
				}
			}
		}
	}
}
