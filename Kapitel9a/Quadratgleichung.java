
public class Quadratgleichung 
{
	public static void main ( String[] args )
	  {
		double x = 4.0;
		double ergebnis;
		
		ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Bei x = " + x + " ergibt die Quadratgleichung den Wert " + ergebnis);
		
		x = 2.0;
		ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Bei x = " + x + " ergibt die Quadratgleichung den Wert " + ergebnis);
		
		x = 2/3;
		ergebnis = 3 * x * x - 8 * x + 4;
		System.out.println("Bei x = " + x + " ergibt die Quadratgleichung den Wert " + ergebnis);
	  }
}
