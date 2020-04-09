class Artikel
{
	String artikelNr;
	double einkaufspreis;
	int lagerzeit;
	String bezeichnung;
	final double HANDELSSPANNE = 0.6; // 60 Prozent des Einkaufspreises
	final double MWST = 0.19;		  // 19 Prozent
	
	//Konstruktoren
	public Artikel(String artikelNr, double einkaufspreis, int lagerzeit, String bezeichnung)
	{
		this.artikelNr = artikelNr;
		this.einkaufspreis = einkaufspreis;
		this.lagerzeit = lagerzeit;
		this.bezeichnung = bezeichnung;
	}
	
	public double berechneVerkaufspreis()
	{
		double verkaufspreis;
		verkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE)) * (1 + MWST);
		return verkaufspreis;
	}
	
	public void anzeigen()
	{
		System.out.println(artikelNr + " " + bezeichnung + 
				" EK: " + einkaufspreis + " VK: " + berechneVerkaufspreis() + " Euro" +
				" Lagerzeit: " + lagerzeit + " Monate \n");
	}
}

class Sonderposten extends Artikel
{
	double rabatt;
	
	Sonderposten(String artikelNr, double einkaufspreis, int lagerzeit, String bezeichnung)
	{ 
		super(artikelNr, einkaufspreis, lagerzeit, bezeichnung);
		if (lagerzeit > 12)
			this.rabatt = 0.30;
		else
			this.rabatt = 0.10;
	}
	
	public void anzeigen()
	{
		System.out.println("Sonderposten: ");
		super.anzeigen();
		System.out.println("(VK <alt>: " + berechneVerkaufspreis() / (100 - (rabatt*100)) * 100 + " Euro Rabatt:" + rabatt * 100 + "%)");
	}
	
	public double berechneVerkaufspreis()
	{
		double verkaufspreis;
		verkaufspreis = (einkaufspreis * (1 + HANDELSSPANNE)) * (1 + MWST) * (1-rabatt);
		return verkaufspreis;
	}
}
public class ArtikelTester 
{
	public static void main( String[] args)
	{
		Artikel art1 = new Artikel("SC123-F", 10.0, 3, "DUFFY MALT WHISKEY");
		Sonderposten sonderp1 = new Sonderposten("SC347-A", 49.0, 15, "GLEN MORANGIE MALT WHISKEY");
		
		art1.anzeigen();
		sonderp1.anzeigen();
//		art2.anzeigen();
	}

}
