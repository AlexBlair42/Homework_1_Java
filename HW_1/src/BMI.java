import java.util.Scanner;

public class BMI {

	public static void main(String[] args)
	{
		BMI();
		System.out.println("BMI Values.\n");
		System.out.println("Underweight: less than  18.5\n");
		System.out.println("Normal: between 18.5 and 24.9\n");
		System.out.println("Overweight: between 25 and 29.9\n");
		System.out.println("Obese: 30 or greater.\n");

	}
	
	public static void BMI()
	{
		System.out.printf(" Please enter your weight in pounds.\n ");
		Scanner input = new Scanner(System.in);
		int weight = input.nextInt();
		
		System.out.printf (" Please enter your height in inches.\n");
		Scanner input1 = new Scanner(System.in);
		int height = input1.nextInt();
		
		double BMI = ((weight*703)/(height*height));
		
		System.out.printf(" Your BMI is %f. \n", BMI);
	}

}
