import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

final class TestClass {
	int primitiveField0 = 10;
	boolean primitiveField1 = true;
	private String stringField0 = "testing... testing... 1, 2, 3...";
	
	public static volatile int thing1 = 0;
	private final String thing2 = "hello";
	
	ArrayList<Boolean> stuff = new ArrayList<>();
	protected HashMap<Integer, HashSet<String>> wierd;
	
	public TestClass (boolean arg0, char arg1, question1 arg2, String arg3) {
		
	}
	
	private TestClass (char arg1, question1 arg2, String arg3) {
		
	}

	public TestClass () {
		
	}
	
	public static String publicStaticMethod (byte arg0) {
		return "7";
	}
	
	public static void publicStaticMethod (byte arg0, int arg1) {
		
	}
	
	private static long privateStaticMethod (byte arg0) {
		return 7;
	}
	
	private static long[] privateStaticMethod (byte[] arg0) {
		return new long[] {};
	}
	
	public void publicMethod0 (float arg0, double arg1) {
		
	}
	
	public HashMap<Integer, HashSet<String>> publicMethod1 (float arg0, double arg1) {
		return wierd;
		
	}
	
	private int[] privateMethod (ArrayList<String> arg0) {
		return new int[] {1, 2, 3};
	}
}