import java.util.Scanner;
public class Fantasy 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int staerke, gesundheit, glueck, gesamtpunktzahl;
		
		System.out.println("Wilkommen zu Yertle's Schatzsuche");
		System.out.println("Geben Sie den Namen der Speilfigur ein: ");
		name = scan.nextLine();
		System.out.println("Staerke eingeben (1-10): ");
		staerke = scan.nextInt();
		System.out.println("Gesundheit eingeben (1-10): ");
		gesundheit = scan.nextInt();
		System.out.println("Glueck eingeben (1-10): ");
		glueck = scan.nextInt();
		
		gesamtpunktzahl = staerke + gesundheit + glueck;
		
		if (gesamtpunktzahl > 15)
		{
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
			staerke = 5;
			gesundheit = 5;
			glueck = 5;
		}
		
		System.out.println(name + 
						  ", Staerke: " + staerke + 
						  ", Gesundheit: " + gesundheit +
						  ", Glueck: " + glueck);
	}
}
