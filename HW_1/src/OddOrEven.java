import java.util.Scanner;

public class OddOrEven 
{

	public static void main(String[] args) 
	{
		
		IsEven();
	}
	// This is the odd or even part of the homework
	public static boolean IsEven()
	{
		System.out.printf (" Please enter a number to be tested. \n");
		int y = 2;  // This is setting the modulo number
		Scanner input = new Scanner(System.in); // This takes an input from the user
		int x = input.nextInt();
		
		if (x % y == 0)// Test the number entered to see if it is 0 when modded with y
		{
			System.out.println(" This is an even number. "); // If it is then it is an even number
			return true;
		}
		else
		{
			System.out.println (" That is an odd number. ");// If it is not then it is odd.
			return false;
		}
	}

}