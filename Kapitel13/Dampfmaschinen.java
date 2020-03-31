import java.util.Scanner;
public class Dampfmaschinen 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double tDampf, tLuft, effizienz;
		
		System.out.println("Geben Sie die Lufttemperatur ein: ");
		tLuft = scan.nextDouble();
		System.out.println("Geben Sie die Dampftemperatur ein: ");
		tDampf = scan.nextDouble();
		
		if (tDampf < 373)
		{
			effizienz = 0;
		}
		else
		{
			effizienz = 1 - tLuft / tDampf;
		}
		System.out.println("Die Effizienz betraegt: " + effizienz);
	}
}
