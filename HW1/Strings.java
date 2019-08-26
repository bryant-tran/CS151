
public class Strings 
{
	public static String uniqueLetters(String str)
	{
		String unique = "";
		
		//loops through each character of the string
		for(int i = 0; i < str.length(); i++)
		{
			//uses a counter to figure out how many times each character occurs
			int count = 0;
			//uses loop to compare characters
			for(int j = 0; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			//if a character only occurs once add it to get returned
			if(count == 1)
			{
				unique = unique + str.charAt(i);
			}
		}
		return unique;
	}
}
