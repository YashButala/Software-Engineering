import java.applet.*;
import java.awt.*;
public class BasicApplet extends Applet{

	public void paint(Graphics g)
	{
		setBackground(Color.green);//background is green
		g.setColor(Color.blue);//changes color to blue
		g.drawString("Hello World!",20,20);
	}

}
