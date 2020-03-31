import java.util.Scanner;
public class SterneKeilform
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int anfangszahl, zeile=0, zaehler=1;
		
		System.out.print("Anfangszahl der Sterne: ");
		anfangszahl = scan.nextInt();
		
		zeile = anfangszahl;
		
		while (zeile > 0)
		{
			while (zaehler <= anfangszahl)
			{
				System.out.print("*");
			zaehler = zaehler + 1;
			}
		System.out.print("\n");
		zaehler = 1;
		anfangszahl = anfangszahl - 1;
		zeile = zeile - 1;
		
		}
	}
		
		
}
