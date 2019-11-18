
import java.util.*;

public class Encoding
{
	public static Set<String> morseCodes(int m, int n)
	{
		Set<String> result = new TreeSet<>();
		String raw = "";

		//adds the right amount of . based on m
		for(int i = 1; i <= m; i++)
		{
			raw = raw + ".";
		}

		//adds the right amount of - based on n
		for(int i = 1; i <= n; i++)
		{
			raw = raw + "-";
		}
		
		//uses a loop to get the combinations
		result = combinations(raw);

		return result;
	}

	//recursive loop works by going character by character 
	public static Set<String> combinations(String input)
	{
		Set<String> set =  new TreeSet<String>();

		if (input.length() == 0) {
			set.add("");
			return set;
		}

		char first = input.charAt(0);
		String leftOver = input.substring(1);
		Set<String> temp = combinations(leftOver);
		for(String string : temp)
		{
			for(int i = 0; i <= string.length(); i++)
			{
				set.add(string.substring(0,i) + first + string.substring(i));
			}
		}
		return set;
	}
}