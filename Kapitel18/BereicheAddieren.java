import java.util.Scanner;
public class BereicheAddieren 
{
	public static void main (String[] args )
	  {
		Scanner scan = new Scanner(System.in);
		int untergrenze=0, obergrenze=0, daten=1;
		int innerhalb=0, ausserhalb=0;
		
		System.out.println("Bereiche addieren");
		System.out.println("Untergrenze des Bereichs:");
		untergrenze = scan.nextInt();
		System.out.println("Obergrenze des Bereichs:");
		obergrenze = scan.nextInt();
		
		while (daten != 0)
		{
		System.out.println("Daten eingeben:");
		daten = scan.nextInt();
		
		if (daten >= untergrenze && daten <= obergrenze)
			innerhalb = innerhalb + daten;
		else
			ausserhalb = ausserhalb + daten;
		}
		
		System.out.println("Summe der Werte innerhalb des Bereichs: " + innerhalb);
		System.out.println("Summe der Werte ausserhalb des Bereichs: " + ausserhalb);
		
		
		
	  }
}
