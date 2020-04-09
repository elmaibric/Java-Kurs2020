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
		System.out.println("Der Vorrat fuer " + this.name + " reicht " + this.anzahlTage + " Tage \n");
	}
}

class Hund extends Haustiere
{
	Hund(String namehaustier, double futter) 
	{
		super(namehaustier, futter);
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
}

class Katze extends Haustiere
{
	Katze(String namehaustier, double futter)
	{
		super(namehaustier, futter);
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
}

public class HaustierFuettern
{
	public static void main( String[] args)
	{
		Katze cat = new Katze("Minka", 5.0);
		cat.anzeigen();
		
		Hund dog = new Hund("Strolchie", 5.0);
		dog.anzeigen();
		
		
	}
}
