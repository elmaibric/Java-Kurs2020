import java.util.Scanner;
public class FlaechevonRechtecken 
{
	public static void main (String[] args )
	  {
		Scanner scan = new Scanner(System.in);
		int firstx, secoundx, firsty, secoundy, hoehe=1, breite=1, flaeche;
		
		System.out.println("CAD Programm");
		
		while (hoehe != 0 || breite != 0)
		{
		System.out.println("Erster Eckpunkt X-Koordinate:");
		firstx = scan.nextInt();
		System.out.println("Erster Exkpunkt Y-Koordinate:");
		firsty = scan.nextInt();
		System.out.println("Zweiter Eckpunkt X-Koordinate:");
		secoundx = scan.nextInt();
		System.out.println("Zweiter Eckpunkt Y-Koordinate:");
		secoundy = scan.nextInt();
		
		if (firstx>secoundx)
			breite = firstx-secoundx;
		else
			breite = secoundx-firstx;
		
		if (firsty>secoundy)
			hoehe = firsty-secoundy;
		else
			hoehe = secoundy-firsty;
		
		flaeche = breite * hoehe;
		
		System.out.println("Breite: " + breite + " Hoehe: " + hoehe + 
							" Flaeche: " + flaeche + "\n");
		}
		
		System.out.println("Fertig!");
		
	  }
}
