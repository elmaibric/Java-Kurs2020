import java.util.Scanner;
public class Mikrowellenherd 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double AnzahlPosten, ErhitzungProPosten, EmpfohleneErhitzung=0;
		
		System.out.println("Anzahl der Posten: ");
		AnzahlPosten = scan.nextDouble();
		System.out.println("Erhitzungszeit pro Posten: ");
		ErhitzungProPosten = scan.nextDouble();
		
		if (AnzahlPosten == 1)
		{
			EmpfohleneErhitzung = ErhitzungProPosten;
			System.out.println("Empfohlene Erhitzungszeit: " + EmpfohleneErhitzung);
		}
		if (AnzahlPosten == 2)
		{
			EmpfohleneErhitzung = ErhitzungProPosten + (ErhitzungProPosten/2);
			System.out.println("Empfohlene Erhitzungszeit: " + EmpfohleneErhitzung);
		}
		if (AnzahlPosten == 3)
		{
			EmpfohleneErhitzung = ErhitzungProPosten * 2;
			System.out.println("Empfohlene Erhitzungszeit: " + EmpfohleneErhitzung);
		}
		if (AnzahlPosten > 3)
		{
			System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfohlen.");
		}
		
		
		
	}
	
}
