import java.util.Scanner;
public class VersandkostenKalkulator 
{
	public static void main (String[] args )
	  {
		Scanner scan = new Scanner(System.in);
		int gewicht=1, differenz;
		double versandgesamt;
		final double versandkosten = 3.0;
		final double zuzahlung = 0.25;
		
		while (gewicht != 0)
		{
			versandgesamt = 0;
			System.out.println("Gewicht der Sendung:");
			gewicht = scan.nextInt();

			if (gewicht <= 10 && gewicht != 0)
			{
				versandgesamt = versandkosten;
				System.out.println("Versandkosten: $" + versandgesamt + "\n");
			}
			else if (gewicht > 10 && gewicht != 0)
			{
				differenz = gewicht - 10;
				versandgesamt = versandkosten + (differenz*zuzahlung);
				System.out.println("Versandkosten: $" + versandgesamt + "\n");
			}
		}
		System.out.println("bye");
	  }
}
