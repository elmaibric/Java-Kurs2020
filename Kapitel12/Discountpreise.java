import java.util.Scanner;
public class Discountpreise 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double betrag, discountpreis, rabatt = 0.10;
		
		System.out.println("Geben Sie den Gesamtbetrag ein: ");
		betrag = scan.nextInt();
		
		if(betrag > 1000)
		{
			 discountpreis = betrag - (betrag * rabatt);
			 System.out.println("Discountpreis: " + discountpreis);
		}
		else
		{
			System.out.println("Kein Rabatt moeglich, Gesamtbetrag: " + betrag);
		}
	}
}
