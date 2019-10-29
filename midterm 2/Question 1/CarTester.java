

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarTester 
{
	public static void main(String[] args)
	{
		JFrame carFrame = new JFrame();
		carFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int width = 100;
		Car carDrawing = new Car(width);
		
		final JLabel carLabel = new JLabel(carDrawing);
		carFrame.setLayout(new BorderLayout());
		carFrame.add(carLabel, BorderLayout.CENTER);
		
		JButton zoomIn = new JButton("Zoom in");
		zoomIn.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carDrawing.changeWidth(carDrawing.getIconWidth()+10);
		    			carLabel.repaint();
		            }
		         });
		
		JButton zoomOut = new JButton("Zoom out");
		zoomOut.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carDrawing.changeWidth(carDrawing.getIconWidth()-10);
						carLabel.repaint();
		            }
		         });
		
		JPanel zoomControls = new JPanel();
		zoomControls.add(zoomIn);
		zoomControls.add(zoomOut);
		carFrame.add(zoomControls, BorderLayout.NORTH);
		
		carFrame.setSize(300,300);
		carFrame.setVisible(true);
	}
}
