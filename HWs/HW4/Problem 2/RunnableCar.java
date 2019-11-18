
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RunnableCar implements Runnable
{
	public RunnableCar(CarShape shape, JLabel label)
    {
        this.shape = shape;
        this.label = label;
    }
	
	public void run() 
    {
        final int DELAY = 1;
        Timer t = new Timer(DELAY, new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    shape.move();
                    label.repaint();
                }
            });
        t.start();
     }
	
	private CarShape shape;
    private JLabel label;
}
