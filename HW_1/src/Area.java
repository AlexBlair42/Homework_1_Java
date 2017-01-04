import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
	Circle();

	}
	public static void Circle()
	{
		System.out.println(" Please enter the radius of a circle. ");
		Scanner input = new Scanner (System.in);
		int r = input.nextInt();
		final double pi = 3.14;
		
		double area = (pi*(r*r));
		System.out.printf("The area of the circle is %f" ,area);
	}

}
