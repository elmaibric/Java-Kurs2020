import java.util.Scanner;
public class NonFettKalkulator 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double PreisA, ProzentA, PreisB, ProzentB, KostenA, KostenB;
		
		System.out.println("Preis pro Pfund Packung A: ");
		PreisA = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung A: ");
		ProzentA = scan.nextDouble();
		System.out.println("Preis pro Pfund Packung B: ");
		PreisB = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung B: ");
		ProzentB = scan.nextDouble();
		
		KostenA = PreisA/(ProzentA/100);
		KostenB = PreisB/(ProzentB/100);
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + KostenA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + KostenB);
		
		if (KostenA < KostenB)
			System.out.println("Packung A ist preiswerter");
		else
			System.out.println("Packung B ist preiswerter");
			
	}
}
