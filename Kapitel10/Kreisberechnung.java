import java.util.Scanner;
public class Kreisberechnung 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner ( System.in );
		
		int radius; 
		double flaeche;	//radius * radius * PI.
		
		System.out.println("Geben sie den Radius ein:");
		radius = scan.nextInt();
		flaeche = radius * radius * Math.PI;
		
		System.out.println("Der Radius ist " + radius + " Die Flaeche betraegt: " + flaeche);
		
	}
}
