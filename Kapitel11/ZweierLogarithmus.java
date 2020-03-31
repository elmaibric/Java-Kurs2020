import java.util.Scanner;
public class ZweierLogarithmus 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double zahl, zweierlog;
		
		System.out.println("Geben Sie ein double ein: ");
		zahl = scan.nextDouble();
		
		zweierlog = (Math.log(zahl)/Math.log(2));
		
		System.out.println("Der Zweierlogarithmus von " + zahl + " ist " + zweierlog);
	}
}
