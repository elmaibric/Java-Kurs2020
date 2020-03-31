
public class Trigonometrie 
{
	public static void main( String[] args)
	{
		double x = 0.5235;
		double sinx;
		double cosx;
		double ergebnis;
		
		sinx = Math.sin(x);
		cosx = Math.cos(x);
		ergebnis = sinx*sinx + cosx*cosx;
		
		System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis);
	
	}
}
