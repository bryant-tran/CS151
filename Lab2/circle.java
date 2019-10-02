import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class circle extends JComponent 
{
	
	public circle()
	{
		setDoubleBuffered(false);
	}
	
	protected void paintComponent(Graphics g)
	{
		if(image == null)
		{
			image = createImage(getSize().width, getSize().height);
			graphics = (Graphics2D) image.getGraphics();
			graphics.clearRect(0, 0, getSize().width, getSize().height);
		}
		g.drawImage(image, 0, 0, null);
	}
	
	public void makeBlue()
	{
		graphics.clearRect(0, 0, getSize().width, getSize().height);
		graphics.setPaint(Color.blue);
		graphics.fillArc(50, 50, 400, 400, 0, 360);
		repaint();
	}
	
	public void makeRed()
	{
		graphics.clearRect(0, 0, getSize().width, getSize().height);
		graphics.setPaint(Color.red);
		graphics.fillArc(50, 50, 400, 400, 0, 360);
		repaint();
	}
	
	public void makeGreen()
	{
		graphics.clearRect(0, 0, getSize().width, getSize().height);
		graphics.setPaint(Color.green);
		graphics.fillArc(50, 50, 400, 400, 0, 360);
		repaint();
	}

	private Image image;
	private Graphics2D graphics;
}



