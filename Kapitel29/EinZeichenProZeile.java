import java.util.Scanner;
public class EinZeichenProZeile 
{
	public static void main( String[] args)
	{
		String eingabe;
		int buchstaben=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie einen String ein:");
		eingabe = scan.next();
		
		while (buchstaben < eingabe.length())
		{
			System.out.println(eingabe.charAt(buchstaben));
			buchstaben = buchstaben + 1;
		}
	}
}
