import java.util.Scanner;
public class Bestellung 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int schrauben, muttern, unterlegscheiben, gesamtbetrag;
		final int schraubenpreis = 5, mutterpreis = 3, unterlegscheibenpreis = 1;
		
		System.out.println("Anzahl der Schrauben: ");
		schrauben = scan.nextInt();
		System.out.println("Anzahl der Muttern: ");
		muttern = scan.nextInt();
		System.out.println("Anzahl der Unterlegscheiben: ");
		unterlegscheiben = scan.nextInt();
		
		if (schrauben > muttern)
		{
			System.out.println("Kontrollieren Sie Ihre Bestellung!");
		}
		else
		{
			System.out.println("Die Bestellung ist okay.");
		}
		
		gesamtbetrag = schrauben*schraubenpreis +
					   muttern*mutterpreis +
					   unterlegscheiben*unterlegscheibenpreis;
		
		System.out.println("Gesamtbetrag: " + gesamtbetrag + " Cent");
		
	}
}
