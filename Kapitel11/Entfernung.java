import java.util.*;
public class Entfernung 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		double sekunden, entfernung, erdbeschleunigung = 9.81;
		
		System.out.println("Geben Sie die Anzahl der Sekunden ein: ");
		sekunden = scan.nextDouble();
		
		entfernung = (0.5 * erdbeschleunigung * sekunden * sekunden);
		
		System.out.println("Die Entfernung e betraegt: " + entfernung + " Meter.");
		
	}
}
