import java.util.*;
public class Ratespiel 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		int versuche=1, eingabezahl=0, computerzahl;
		
		computerzahl = rand.nextInt(10)+1;
		
		System.out.println("Ich denke an eine Zahl von 1 bis 10.");
		System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
		System.out.println("Raten Sie!");
		
		while (versuche <= 3 && eingabezahl != computerzahl)
		{
			System.out.println("Versuch: " + versuche);
			eingabezahl = scan.nextInt();
			
			if (computerzahl==eingabezahl)
			{
				System.out.println("RICHTIG!");
				System.out.println("Sie haben das Spiel gewonnen.");
			}
			else
			{
				System.out.println("Falsch");
			}	
			versuche = versuche + 1;
		}
		
		if (eingabezahl != computerzahl)
		{
		System.out.println("Die richtige Zahl war " + computerzahl);
		System.out.println("Sie haben das Spiel verloren.");
		}
		
	}
}
