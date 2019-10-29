

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   A program that allows users to edit a scene composed
   of items.
*/
public class question2
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      final SceneComponent scene = new SceneComponent();

      JButton carButton = new JButton("Car");
      carButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               scene.add(new CarShape(20, 20, 50));
            }
         });

      JButton removeButton = new JButton("Remove");
      removeButton.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               scene.removeSelected();
            }
         });
      
      JButton animateButton = new JButton("Animate");
      final int DELAY = 100;
      Timer t = new Timer(DELAY, event ->
      {
    	  scene.moveSelected();
    	  frame.repaint();
      });
      animateButton.addActionListener(new
    		  ActionListener()
    		  {
    	  		public void actionPerformed(ActionEvent event)
    	  		{
    	  			if(t.isRunning())
    	  			{
    	  				t.stop();
    	  			}
    	  			else
    	  			{
    	  				t.start();
    	  			}
    	  		}
    		  });
      
      JPanel buttons = new JPanel();
      buttons.add(carButton);
      buttons.add(removeButton);
      buttons.add(animateButton);

      frame.add(scene, BorderLayout.CENTER);
      frame.add(buttons, BorderLayout.NORTH);

      frame.setSize(300, 300);
      frame.setVisible(true);
   }
}


