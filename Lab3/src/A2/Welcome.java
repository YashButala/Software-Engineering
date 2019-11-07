
public class Welcome extends Applet {
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawRect(100, 100, 200, 150);
		g.setColor(Color.red);
		g.drawString("WELCOME",120,120);
	}
}
