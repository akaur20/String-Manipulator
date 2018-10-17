/*
 * Avleen Kaur Period 7
 */
public class StringManipulator 
{
	
	public String noVowels(String string)
	{
		String someString = "";
		for(int i = 0; i < string.length(); i++)
		{
			char character = string.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
			{
				someString += "*";	
			}
			else
			{
				someString += character;
			}

		}
		return someString;
	}
	
	public String reverse(String string)
	{
		String someString = "";
		for(int i = string.length()-1; i >= 0; i--)
		{
			char character = string.charAt(i);
			someString += character;
		}
		return someString;
	}
}
