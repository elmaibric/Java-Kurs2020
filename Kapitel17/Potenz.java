import java.util.Scanner;
public class Potenz 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double x, ergebnis = 1.0;
		int n, zaehler=1;
		
		System.out.println("Geben Sie x ein: ");
		x = scan.nextDouble();
		System.out.println("Geben Sie n ein: ");
		n = scan.nextInt();
		
		if (n < 0)
		{
			System.out.println("n muss ein positiver Integer sein.");
		}
		else
		{
			while (zaehler <= n)
			{
				ergebnis = ergebnis * x;
				zaehler = zaehler + 1;
			}
			System.out.println(x + " hoch " + n + " ergibt: " + ergebnis);
		}
	}
}
