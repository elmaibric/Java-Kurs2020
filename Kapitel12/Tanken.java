import java.util.Scanner;
public class Tanken 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int tankkapazitaet, benzinanzeige, meilenprogallone, weite;
		
		System.out.println("Tankkapazitaet: ");
		tankkapazitaet = scan.nextInt();
		System.out.println("Benzinanzeige: ");
		benzinanzeige = scan.nextInt();
		System.out.println("Meilen pro Gallone: ");
		meilenprogallone = scan.nextInt();
		
		weite = tankkapazitaet * benzinanzeige / 100*meilenprogallone;
		
		if (weite > 200)
			System.out.println("Weiterfahren...");
		else
			System.out.println("Tanken!");
		
		
		
	}
}
