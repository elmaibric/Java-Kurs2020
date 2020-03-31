import java.util.Scanner;
public class Wechselgeld 
{
	public static void main( String[] argms)
	{
		Scanner scan = new Scanner(System.in);
		
		int eingabe, dollar, quater, dime, nickel, cent;
		
		System.out.println("Geben Sie das Wechselgeld ein: ");
		eingabe = scan.nextInt();
		
		dollar = eingabe / 100;
		eingabe = eingabe % 100;
		quater = eingabe / 25;
		eingabe = eingabe % 25;
		dime = eingabe / 10;
		eingabe = eingabe % 10; 
		nickel = eingabe / 5;
		eingabe = eingabe % 5;
		cent = eingabe;
		
		System.out.println("Das Wechselgeld ist: " + dollar + " Dollar " + quater + " Quater " + 
		dime + " Dime " + nickel + " Nickel " + cent + " Cent ");
		
	}
}
