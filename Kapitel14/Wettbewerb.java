import java.util.Scanner;
public class Wettbewerb 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double gewicht;
		
		System.out.println("Geben Sie ihr Gewicht ein: ");
		gewicht = scan.nextDouble();
		
		if (gewicht >= 235 && gewicht <= 265)
			System.out.println("Sie sind zum Wettbewerb zugelassen.");
		else
			System.out.println("Sie sind zum Wettbewerb nicht zugelassen.");
	}
}
