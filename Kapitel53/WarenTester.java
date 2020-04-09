class Waren
{
  private String beschreibung;
  private double preis;
  private int anzahl;

  public Waren( String beschreibung, double preis, int anzahl )
  {
    this.beschreibung = beschreibung;
    this.preis        = preis;
    this.anzahl       = anzahl;
  }

  public void anzeigen()
  {
    System.out.println( "Artikel: " + beschreibung +
        " Preis: " + preis + " Anzahl: " + anzahl);
  }

  public double getPreis()
  {
	  return this.preis;
  }
  public void setPreis(double preis)
  {
	  this.preis = preis;
  }
  public int getAnzahl()
  {
	  return this.anzahl;
  }
  public void setAnzahl(int anzahl)
  {
	  this.anzahl = anzahl;
  }

}

class Lebensmittel extends Waren
{
  double kalorien;

  Lebensmittel( String beschreibung, double preis, int anzahl, double kalorien)
  {
    super( beschreibung, preis, anzahl );
    this.kalorien = kalorien ;
  }

  public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Kalorien: " + kalorien );
  }
}

interface Besteuerbar
{
  final double STEUERSATZ = 0.06 ;
  double berechneSteuer() ;
}

class Spielwaren extends Waren implements Besteuerbar
{
  int mindestalter;

  Spielwaren( String beschreibung, double preis, int anzahl, int mindestalter)
  {
    super( beschreibung, preis, anzahl );
    this.mindestalter = mindestalter;
  }

  public void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Mindestalter: " + mindestalter );
  }

  public double berechneSteuer()
  {
    return super.getPreis() * STEUERSATZ ;
  }
}

class Buecher extends Waren implements Besteuerbar
{
  String autor;

  Buecher( String beschreibung, double preis, int anzahl, String autor)
  {
    super( beschreibung, preis, anzahl );
    this.autor  = autor ;
  }

  public void anzeigen()
  {
    super.anzeigen() ;
    System.out.println( "Autor: " + autor );
  }

  public double berechneSteuer()
  {
    return getPreis() * STEUERSATZ ;
  }
}

public class WarenTester
{
	public static void main ( String[] args )
	  {
		Waren         waren        = new Waren( "Tube", 1.40, 7 );
	    Lebensmittel  lebensmittel = new Lebensmittel ( "Milch", 0.95, 3, 690 );
	    Spielwaren    spiel        = new Spielwaren  ( "Lego", 24.45, 2, 8 );
	    Buecher       buch         = new Buecher ( "Emma", 14.95, 8, "Austin" );
	    
	    waren.anzeigen();

	    lebensmittel.anzeigen();

	    spiel.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + spiel.berechneSteuer() + "\n" );

	    buch.anzeigen();
	    System.out.println
	      ("Die Steuer betraegt: " + buch.berechneSteuer() + "\n" );
	  }
}
