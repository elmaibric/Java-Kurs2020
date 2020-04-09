abstract class Haustiere
{
	String name;
	double futtervorrat;
	int anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht
	
	Haustiere(String namehaustier, double futter)
	{
		name = namehaustier;
		futtervorrat = futter;
	}
	
	public abstract void friss();
	public abstract void sprich();
	
	public void fuettern()
	{
		sprich();
		while (futtervorrat > 0)
		{
			friss();
			anzahlTage++;
		}
	}
	
	public void anzeigen()
	{
		fuettern();
		System.out.print("Der Vorrat fuer " + this.name + " reicht " + this.anzahlTage + " Tage \n");
	}
}

class Hund extends Haustiere
{
	String kategorie;
	Hund(String namehaustier, double futter, String ktg) 
	{
		super(namehaustier, futter);
		kategorie = ktg;
		
		if (kategorie.equals("1"))
			kategorie = "Kleinhunde";
		if (kategorie.equals("2"))
			kategorie = "Mittelgrosse Hunde";
		if (kategorie.equals("3"))
			kategorie = "Grosse Hunde";
	}
	
	public void sprich()
	{
		System.out.println("Wuff!");
	}
	
	public void friss()
	{
		System.out.println(name + ": " + futtervorrat);
		futtervorrat -= 1.0;
	}
	
	public void anzeigen()
	{
		super.anzeigen();
		System.out.print("(Kategorie: " + kategorie + ") \n");
	}
}

class Katze extends Haustiere
{
	String haltung;
	Katze(String namehaustier, double futter, String shaltung)
	{
		super(namehaustier, futter);
		haltung = shaltung;
		
		if (haltung.equals("1"))
			haltung = "Wohnung";
		if (haltung.equals("2"))
			haltung = "Artgerecht";
	}
	
	public void sprich()
	{
		System.out.println("Miau!");
	}
	
	public void friss()
	{
		System.out.println(name + ": " + futtervorrat);
		futtervorrat-= 0.5;
	}
	
	public void anzeigen()
	{
		super.anzeigen();
		System.out.print("(Haltung: " + haltung + ") \n \n");
	}
}

public class HaustierFuettern
{
	public static void main( String[] args)
	{
		Katze cat = new Katze("Minka", 5.0, "1");
		cat.anzeigen();
		
		Hund dog = new Hund("Strolchie", 5.0, "1");
		dog.anzeigen();
		
		
	}
}
