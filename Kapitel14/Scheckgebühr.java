import java.util.Scanner;
public class Scheckgebühr 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double girokonto, sparkonto;
		
		System.out.println("Kontostand Girokonto: ");
		girokonto = scan.nextDouble();
		System.out.println("Kontostand Sparkonto: ");
		sparkonto = scan.nextDouble();
		
		if (girokonto > 1000 || sparkonto > 1500)
			System.out.println("Keine Scheckgebuehr.");
		else
			System.out.println("Scheckgebuehr: 0.15$");
	}
}
