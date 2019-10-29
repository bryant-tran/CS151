

import java.awt.*;
import java.awt.geom.*;

import javax.swing.Icon;

public class Bus implements Icon
{
	public Bus(int aWidth)
	{
		width = aWidth;
	}
	
	public void changeWidth(int newWidth)
	{
		width = newWidth;
	}
	
	public int getIconWidth()
	{
		return width;
	}
	
	public int getIconHeight()
	{
		return width / 2;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double body
		= new Rectangle2D.Double(x, y + width / 6, 
				width - 1, width / 6);
		Ellipse2D.Double frontTire
		= new Ellipse2D.Double(x + width / 6, y + width / 3, 
				width / 6, width / 6);
		Ellipse2D.Double rearTire
		= new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
				width / 6, width / 6);

		// The bottom of the front windshield
		Point2D.Double r1
		= new Point2D.Double(x , y + width / 6);
		// The front of the 2nd floor
		Point2D.Double r2
		= new Point2D.Double(x , y);
		// The rear of the 2nd floor
		Point2D.Double r3
		= new Point2D.Double(x + width - 1, y);
		// The bottom of the rear windshield
		Point2D.Double r4
		= new Point2D.Double(x + width - 1, y + width / 6);
		
		// The front of the roof
		Point2D.Double r6
		= new Point2D.Double(x , y * 3/4);
		// The rear of the roof
		Point2D.Double r7
		= new Point2D.Double(x + width - 1, y * 3/4);

		Line2D.Double frontWindshield
		= new Line2D.Double(r1, r6);
		Line2D.Double roofTop
		= new Line2D.Double(r6, r7);
		Line2D.Double rearWindshield
		= new Line2D.Double(r4, r7);
		Line2D.Double secondFloor
		= new Line2D.Double(r2, r3);
		
		g2.fill(frontTire);
		g2.fill(rearTire);
		g2.setColor(Color.blue);
		g2.fill(body);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
		g2.draw(secondFloor);
	}
	
	private int width;
}
