import java.util.Scanner;
public class TempConversion
{
	public static void main(String[] args)
	{
		double Celcius;
		double Fahrenheit;
		Scanner tempInput = new Scanner(System.in);
		Celcius = tempInput.nextDouble();
		
		Fahrenheit = (9/5) * Celcius + 32;
		System.out.println(Fahrenheit);
		
	}
}