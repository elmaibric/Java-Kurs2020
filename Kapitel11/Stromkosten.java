import java.util.*;
public class Stromkosten 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		double preis, anzahl, jahreskosten;
		
		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
		preis = scan.nextDouble();
		
		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
		anzahl = scan.nextDouble();
		
		preis = preis / 100;
		jahreskosten = anzahl * preis;
		
		System.out.println("Jahreskosten: " + jahreskosten);
	}
}
