import java.awt.Rectangle;

public class dumpArray 
{
	public dumpArray(Object[] array)
	{
		this.array = array;
	}
	
	public void dump()
	{
		for(Object o: array)
		{
			System.out.println(o.toString());
		}
	}
	
	private Object[] array;
	
	public static void main(String[] args)
	{
		Object test[] = new Object[4];
		test[0] = new Rectangle();
		test[1] = "test";
		test[2] = 0;
		test[3] = 0.0;
		
		dumpArray tester = new dumpArray(test);
		tester.dump();
	}
}

