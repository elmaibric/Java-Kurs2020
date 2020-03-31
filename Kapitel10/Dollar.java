import java.util.Scanner;
public class Dollar 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int cent, dollar, eingabe;
		
		System.out.println("Geben Sie die Cent ein:");
		eingabe = scan.nextInt();
		
		cent = eingabe % 100;
		dollar = eingabe / 100;
		
		System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
		
	}
	
}
