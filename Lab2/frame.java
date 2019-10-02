import java.awt.*;

import javax.swing.*;

public class frame 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		Container window = frame.getContentPane();
		
		window.setLayout(new BorderLayout());
		
		circle drawing = new circle();
		window.add(drawing, BorderLayout.CENTER);
		
		JButton redButton = new JButton("Red");
		redButton.addActionListener(event ->
        drawing.makeRed());
		
		JButton blueButton = new JButton("Blue");
		redButton.addActionListener(event ->
        drawing.makeBlue());
		
		JButton greenButton = new JButton("Green");
		redButton.addActionListener(event ->
        drawing.makeGreen());
		
		JPanel controls = new JPanel();
		controls.add(redButton);
		controls.add(blueButton);
		controls.add(greenButton);
		
		window.add(controls, BorderLayout.SOUTH);
		
		frame.setSize(500,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


}
