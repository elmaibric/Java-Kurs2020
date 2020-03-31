import java.util.*;
public class Delikatessen 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String artikel;
		double preis, versand, versandkosten, gesamt;
		final double expressversand = 5.0;
		
		System.out.println("Geben Sie den Artikel ein:");
		artikel = scan.nextLine();
		System.out.println("Geben Sie den Preis ein:");
		preis = scan.nextDouble();
		System.out.println("Expressversand (0=nein, 1=ja):");
		versand = scan.nextDouble();
		
		if (preis >= 10)
		{
			versandkosten = 3;
		}
		else
		{
			versandkosten = 2;
		}
		
		if (versand == 1)
		{
			versandkosten = versandkosten + expressversand;
		}

		
		gesamt = preis + versandkosten;
		
		System.out.println("Rechnung \n" +
		artikel + ": " + preis + "\n" + 
		"Versand: " + versandkosten + "\n" +
		"Gesamt: " + gesamt);
	}				
}

