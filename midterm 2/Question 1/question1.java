
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class question1
{
	public static void main(String[] args)
	{
		//Car
		JFrame carFrame = new JFrame();
		carFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int width = 100;
		Car carDrawing = new Car(width);
		
		final JLabel carLabel = new JLabel(carDrawing);
		carFrame.setLayout(new BorderLayout());
		carFrame.add(carLabel, BorderLayout.CENTER);
		
		
		//Bus
		JFrame busFrame = new JFrame();
		busFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Bus busDrawing = new Bus(width);
		
		final JLabel busLabel = new JLabel(busDrawing);
		busFrame.setLayout(new BorderLayout());
		busFrame.add(busLabel, BorderLayout.CENTER);
		
		//Zoom for car
		JButton zoomIn = new JButton("Zoom in");
		zoomIn.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carDrawing.changeWidth(carDrawing.getIconWidth()+10);
		    			carLabel.repaint();
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
		            	carDrawing.changeWidth(carDrawing.getIconWidth()-10);
						carLabel.repaint();
						busDrawing.changeWidth(busDrawing.getIconWidth()-10);
						busLabel.repaint();
		            }
		         });
		
		JPanel zoomControls = new JPanel();
		zoomControls.add(zoomIn);
		zoomControls.add(zoomOut);
		carFrame.add(zoomControls, BorderLayout.NORTH);
		
		//Zoom for bus
		JButton zoomInBus = new JButton("Zoom in");
		zoomInBus.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carDrawing.changeWidth(carDrawing.getIconWidth()+10);
		    			carLabel.repaint();
		    			busDrawing.changeWidth(busDrawing.getIconWidth()+10);
		    			busLabel.repaint();
		            }
		         });
		
		JButton zoomOutBus = new JButton("Zoom out");
		zoomOutBus.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carDrawing.changeWidth(carDrawing.getIconWidth()-10);
						carLabel.repaint();
						busDrawing.changeWidth(busDrawing.getIconWidth()-10);
						busLabel.repaint();
		            }
		         });
		
		JPanel zoomControlsBus = new JPanel();
		zoomControlsBus.add(zoomInBus);
		zoomControlsBus.add(zoomOutBus);
		busFrame.add(zoomControlsBus, BorderLayout.NORTH);
		
		//Buttons to switch for car
		JButton carOnCar = new JButton("Car");
		carOnCar.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carFrame.setVisible(true);
		            	busFrame.setVisible(false);
		            }
		         });
		
		JButton busOnCar = new JButton("Bus");
		busOnCar.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carFrame.setVisible(false);
		            	busFrame.setVisible(true);
		            }
		         });
		
		JPanel switchControlsCar = new JPanel();
		switchControlsCar.add(carOnCar);
		switchControlsCar.add(busOnCar);
		carFrame.add(switchControlsCar, BorderLayout.WEST);
		
		//Buttons to switch for bus
		JButton carOnBus = new JButton("Car");
		carOnBus.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carFrame.setVisible(true);
		            	busFrame.setVisible(false);
		            }
		         });
		
		JButton busOnBus = new JButton("Bus");
		busOnCar.addActionListener(new
				ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	carFrame.setVisible(false);
		            	busFrame.setVisible(true);
		            }
		         });
		
		JPanel switchControlsBus = new JPanel();
		switchControlsBus.add(carOnBus);
		switchControlsBus.add(busOnBus);
		busFrame.add(switchControlsBus, BorderLayout.WEST);
		
		carFrame.setSize(500,500);
		carFrame.setVisible(true);
		
		busFrame.setSize(500,500);
		busFrame.setVisible(false);
	}
}
