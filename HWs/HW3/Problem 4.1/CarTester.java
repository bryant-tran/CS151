package carResizing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CarTester implements ActionListener
{
	
	public CarTester()
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		drawing = new Car(CAR_WIDTH);

		label = new JLabel(drawing);
		frame.setLayout(new BorderLayout());
		frame.add(label, BorderLayout.CENTER);

		zoomIn = new JButton("Zoom in");
		zoomOut = new JButton("Zoom out");
		
		zoomIn.addActionListener(this);
		zoomOut.addActionListener(this);
		

		JPanel controls = new JPanel();
		controls.add(zoomIn);
		controls.add(zoomOut);
		frame.add(controls, BorderLayout.NORTH);
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new CarTester();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(zoomIn))
		{
			drawing.changeWidth(drawing.getIconWidth()+10);
			label.repaint();
		}
		else
		{
			if(drawing.getIconWidth() != 0)
			{
				drawing.changeWidth(drawing.getIconWidth()-10);
				label.repaint();
			}
		}
	}

	private static final int CAR_WIDTH = 100;
	private JButton zoomIn, zoomOut;
	private Car drawing;
	final JLabel label;
}
