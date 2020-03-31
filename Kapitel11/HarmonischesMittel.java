import java.util.*;
public class HarmonischesMittel 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double x, y;
		double ArithMittel, HarmMittel;
		
		System.out.println("Geben Sie x ein: ");
		x = scan.nextInt();
		System.out.println("Geben Sie y ein: ");
		y = scan.nextInt();
		
		ArithMittel = (x+y)/2;
		HarmMittel = 2 / (1/x + 1/y);
		
		System.out.println("Arithmetisches Mittel: " + ArithMittel);
		System.out.println("Harmonisches Mittel: " + HarmMittel);
	}
}
