import java.util.Scanner;
public class Wirkstoffgehalt 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner (System.in);
		double wirkstoffgehalt=100.0;
		int monat=0;
		
		while (wirkstoffgehalt > 50)
		{
			System.out.println("Monat: " + monat + "\t Wirkstoffgehalt: " + wirkstoffgehalt);
			wirkstoffgehalt = wirkstoffgehalt - (wirkstoffgehalt*0.04);
			monat = monat + 1;
			
			if (wirkstoffgehalt<50)
			{
			System.out.println("Monat: " + monat + "\t Wirkstoffgehalt: " + wirkstoffgehalt + 
					" ABGELAUFEN");
			}
		}
	}
}
