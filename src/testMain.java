import java.util.Scanner;

public class testMain {

	public static void main(String[] args) 
	{
	
		StringManipulator string = new StringManipulator();
		Scanner in = new Scanner(System.in);
		boolean tryAgain = true;
		
		while (tryAgain == true)
		{
			System.out.println("What method would  you like to run? Type Vowel or Reverse");
			String choice = in.next();
			
			while (!choice.equals("Vowel") && !choice.equals("Reverse"))
			{
				System.out.println("Wrong!! What method would  you like to run? Type Vowel or Reverse");
				choice = in.next();	
				
			}
			if (choice.equals("Vowel"))
			{
				System.out.println(string.noVowels("hello"));
			}
			
			if (choice.equals("Reverse"))
			{
				System.out.println(string.reverse("hello"));
			}
			
		}
		
		
	}

}
