import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class hw4 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarShape shape1 = new CarShape(0, 0, CAR_WIDTH, 1);
		ShapeIcon icon = new ShapeIcon(shape1, ICON_WIDTH, ICON_HEIGHT);
		final JLabel label1 = new JLabel(icon);
		
		CarShape shape2 = new CarShape(0, 0, CAR_WIDTH, 2);
		ShapeIcon icon2 = new ShapeIcon(shape2, ICON_WIDTH, ICON_HEIGHT);
		final JLabel label2 = new JLabel(icon2);
		
		CarShape shape3 = new CarShape(0, 0, CAR_WIDTH, 3);
		ShapeIcon icon3 = new ShapeIcon(shape3, ICON_WIDTH, ICON_HEIGHT);
		final JLabel label3 = new JLabel(icon3);
		
		frame.setLayout(new FlowLayout());
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);

		RunnableCar car1 = new RunnableCar(shape1, label1);
		RunnableCar car2 = new RunnableCar(shape2, label2);
		RunnableCar car3 = new RunnableCar(shape3, label3);

		Thread one   = new Thread(car1);
		Thread two   = new Thread(car2);
		Thread three = new Thread(car3);

		one.start();
		two.start();
		three.start();

		frame.setSize(600, 600);
		frame.setVisible(true);
	}
	
	private static final int ICON_WIDTH = 600;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
