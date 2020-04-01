import java.util.*;
public class Equals 
{
	public static void main( String[] args)
	{
		int zaehler=1, summe=0, eingabe;
		boolean jaodernein=false;
		String eingabeJaNein, antwort = "ja";
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Eingabeaufforderung <ja> oder <nein>? ");
		eingabeJaNein = scan.next();
		
		if (eingabeJaNein.equals(antwort))
			jaodernein = true;
		else
			jaodernein = false;
		
			while (zaehler <= 5)
			{
				if (jaodernein == true)
				{
				System.out.println("Geben Sie " + zaehler + ". Zahl ein:");
				}
				
				eingabe = scan.nextInt();
				summe = summe + eingabe;
				zaehler = zaehler + 1;
			}
			System.out.println("Gesamtsumme: " + summe);
		
	}
}
