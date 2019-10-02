import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class circle implements Icon 
{
	public int width;
	
	public circle(int aWidth)
	{
		width = aWidth;
	}
	
	public int getIconWidth()
	{
	    return width;
	}
	
	public int getIconHeight()
	{
		return width;
	}
	

	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width,width);
				
	}
	}
}
