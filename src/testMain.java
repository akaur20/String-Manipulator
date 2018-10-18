import java.util.Scanner;

public class testMain {

	public static void main(String[] args) 
	{
	
		StringManipulator string = new StringManipulator();
		Scanner in = new Scanner(System.in);
		boolean tryAgain = true;
		
		while (tryAgain == true)
		{
			System.out.println("What method would  you like to run? Type vowel or reverse");
			String choice = in.next();
			
			while (!choice.equals("vowel") && !choice.equals("reverse"))
			{
				System.out.println("Wrong!! What method would  you like to run? Type vowel or reverse");
				choice = in.next();		
			}
			
			System.out.println("Please enter a word to convert: ");
			String userWord = in.next();
			if (choice.equals("vowel"))
			{
				System.out.println(string.noVowels(userWord));
			}
			
			if (choice.equals("reverse"))
			{
				System.out.println(string.reverse(userWord));
			}
			
			System.out.println("Would you like to play again? Say yes or no");
			String playAgain = in.next();
			
			while (!playAgain.equals("yes") && !playAgain.equals("no"))
			{
				System.out.println("Would you like to play again? Say yes or no");
				playAgain = in.next();
				
			}
			
			if (playAgain.equals("no"))
			{
				tryAgain = false;
				System.out.println("Thanks for playing!");
			}
			
		}
		
		
	}

}
