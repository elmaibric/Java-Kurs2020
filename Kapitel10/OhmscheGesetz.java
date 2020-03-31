import java.util.Scanner;
public class OhmscheGesetz 
{
	public static void main( String[] argms)
	{
		double spannung, wiederstand, stromstaerke;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Geben Sie die Spannung (in Volt) ein: ");
		spannung = scan.nextDouble();
		
		System.out.println("Geben Sie den Wiederstand (in Ohm) ein: ");
		wiederstand = scan.nextDouble();
		
		stromstaerke = spannung/wiederstand;
		
		System.out.println("Die Stromstaerke betraegt: " + stromstaerke);
		
	}
}
