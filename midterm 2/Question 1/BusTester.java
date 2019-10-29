

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BusTester 
{
	public static void main(String[] args)
	{
		JFrame busFrame = new JFrame();
		busFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int width = 100;
		Bus busDrawing = new Bus(width);
		
		final JLabel busLabel = new JLabel(busDrawing);
		busFrame.setLayout(new BorderLayout());
		busFrame.add(busLabel, BorderLayout.CENTER);
		
		JButton zoomIn = new JButton("Zoom in");
		zoomIn.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	busDrawing.changeWidth(busDrawing.getIconWidth()+10);
		    			busLabel.repaint();
		            }
		         });
		
		JButton zoomOut = new JButton("Zoom out");
		zoomOut.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	busDrawing.changeWidth(busDrawing.getIconWidth()-10);
						busLabel.repaint();
		            }
		         });
		
		JPanel zoomControls = new JPanel();
		zoomControls.add(zoomIn);
		zoomControls.add(zoomOut);
		busFrame.add(zoomControls, BorderLayout.NORTH);
		
		busFrame.setSize(300,300);
		busFrame.setVisible(true);
	}
}

