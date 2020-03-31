import java.util.Scanner;
public class Ratenzahlung 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner (System.in);
		double saldo=0, n, gesamtbetrag=0;
		double zins = 0;
		int monat=0;
		
		System.out.println("Geben Sie das Anfangssaldo ein:");
		saldo = scan.nextDouble();
		System.out.println("Geben sie den monatlichen Zinssatz ein:");
		zins = scan.nextDouble();
		zins = zins/100;
		System.out.println("Geben Sie den monatlichen Rueckzahlungsbetrag ein:");
		n = scan.nextDouble();
		
		while (saldo >= 0 & saldo > n)
		{
		saldo = saldo + (saldo*zins) - n;
		monat = monat + 1;
		gesamtbetrag = gesamtbetrag + n;
		
		System.out.println("Der letzte Rate bis 0 betraegt:");
		
		System.out.println("Monat: " + monat  + "\t Saldo: " + saldo + "\t Gesamtbetrag: " + gesamtbetrag);
		}
		
		System.out.println("Der letzte Rate bis 0 betraegt: " + saldo);
	}
}
