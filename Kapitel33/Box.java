
public class Box 
{
//Instanzvariablen
	private double breite, hoehe, laenge, seite;
//Konstruktoren
	Box(double dbreite, double dhoehe, double dlaenge)
	{
		breite = dbreite;
		hoehe = dhoehe;
		laenge = dlaenge;
	}
	Box(double dseite)
	{
		breite = seite;
		hoehe = seite;
		laenge = seite;
	}
	Box (Box alteBox)
	{
		
	}
// Methoden
	public Box groessereBox()
	{
		return new Box(1.25*breite, 1.25*hoehe, 1.25*laenge);
	}
	public Box kleinereBox()
	{
		return new Box(0.75*breite, 0.75*hoehe, 0.76*laenge);
	}
	private double berechneOberflaecheVorn()
	{
		return breite*hoehe;
	}
	private double berechneOberflaecheOben()
	{
		return breite*laenge;
	}
	private double berechneOberflaecheSeitlich()
	{
		return hoehe*laenge;
	}
	public double berechneVolumen()
	{
		return breite*hoehe*laenge;
	}
	public double berechneOberflaeche()
	{
		return 2*berechneOberflaecheVorn() +
			   2*berechneOberflaecheOben() +
			   2*berechneOberflaecheSeitlich();
	}
	public double getLange()
	{
		return laenge;
	}
	public double getHoehe()
	{
		return hoehe;
	}
	public double getBreite()
	{
		return breite;
	}
	void anzeigen()
	{
		System.out.println("Lange: " + laenge + " Hoehe: " + hoehe + " Breite: " + breite);
	}
	public boolean passtIn(Box innereBox, Box aeussereBox)
	{
		if (innereBox.breite < aeussereBox.breite && innereBox.hoehe < aeussereBox.hoehe && innereBox.laenge < aeussereBox.laenge)
			return true;
		else
			return false;
	}
}
class BoxTester
{
	 public static void main ( String[] args )
	  {
	     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

	     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
	                         " Volumen: " + box. berechneVolumen( ) );
	     box.anzeigen();
	     
	     Box box2 = new Box( 3.0, 7.0, 8.0);
	     if (box.passtIn(box, box2))
	    	 System.out.println("Passt in die aeussere Box!");
	     else
	    	 System.out.println("Passt nicht in die aeussere Box!");
//	     System.out.println( "Laenge: " + box.laenge +
//	                         " Hoehe: " + box. hoehe +
//	                         "Breite: " + box.breite )  ;
	  }
}
