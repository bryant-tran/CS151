import java.lang.reflect.*;

public class question1 
{
	public static void dumpClass(Object o)
	{
		Class theClass = o.getClass();
		Class theSuperclass = theClass.getSuperclass();
		Field[] theFields = theClass.getDeclaredFields();
		Constructor[] theConstructors = theClass.getDeclaredConstructors();
		Method[] theMethods = theClass.getDeclaredMethods();
		
		System.out.println("Superclass: " + theSuperclass.getName());
		System.out.println(Modifier.toString(theClass.getModifiers()) + " class " + theClass.getName());
		
		System.out.println();
		
		System.out.println("       //Fields: ");
		for(Field f: theFields)
		{
			System.out.println("       " + f.getType().getSimpleName() + " " + f.getName());
		}
		
		System.out.println();
		
		System.out.println("       //Constructors: ");
		for(Constructor c : theConstructors)
		{
			Parameter[] theParameters = c.getParameters();
			String allParameters = "";
			for(Parameter p : theParameters)
			{
				allParameters = allParameters + p.getType().getSimpleName() + " " + p.getName() + ", ";
			}
			if(allParameters.length()>2)
			{
				String simplified = allParameters.substring(0, allParameters.length()-2);
				System.out.println("       " + Modifier.toString(c.getModifiers()) + " " + c.getName() + " (" + simplified + ")");
			}
			else
			{
				System.out.println("       " + Modifier.toString(c.getModifiers()) + " " + c.getName() + " (" + allParameters + ")");
			}
		}
		
		System.out.println();
		
		System.out.println("       //Methods: ");
		for(Method m : theMethods)
		{
			Parameter[] theParameters = m.getParameters();
			String allParameters = "";
			for(Parameter p : theParameters)
			{
				allParameters = allParameters + p.getType().getSimpleName() + " " + p.getName() + ", ";
			}
			if(allParameters.length()>2)
			{
				String simplified = allParameters.substring(0, allParameters.length()-2);
				System.out.println("       " + Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getSimpleName() + " " + m.getName() + " (" + simplified + ")");
			}
			else
			{
				System.out.println("       " + Modifier.toString(m.getModifiers()) + " " + m.getName() + " (" + allParameters + ")");
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		question1 test = new question1();
		dumpClass(test);
		System.out.println();
		TestClass test2 = new TestClass();
		dumpClass(test2);
	}
}
