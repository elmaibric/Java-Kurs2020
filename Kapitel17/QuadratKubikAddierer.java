import java.util.Scanner;
public class QuadratKubikAddierer 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int zaehler, eingabe, quadrat=0, kubik=0;
		
		System.out.println("Geben Sie n ein: ");
		eingabe = scan.nextInt();
		
		zaehler = 1;
		while (0 < eingabe)
		{
			quadrat = quadrat + (eingabe*eingabe);
			kubik = kubik + (eingabe*eingabe*eingabe);
			eingabe = eingabe - 1;
		}
		
		System.out.println("Die Quadratsumme ist: " + quadrat);
		System.out.println("Die Kubiksumme ist: " + kubik);
		
	}
}
