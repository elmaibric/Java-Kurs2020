import java.util.Scanner;

abstract class Karte
{
  String empfaenger, anrede;
  
  public abstract void gruss();
  
  Karte(String e, String sex)
  {
	  empfaenger = e;
	  anrede = sex;
	  
	  if (sex.equals("w"))
		  this.anrede = "Liebe ";
	  
	  if (sex.equals("m"))
		  this.anrede = "Lieber ";
  }
}

class Feiertag extends Karte
{
  public Feiertag( String e, String sex )
  {
    super (e, sex);
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}
class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, String sex, int jahre )
  {
    super(e, sex);
    alter = jahre;
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}
class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, String sex, int k )
  {
    super(e, sex);
    kuesse     = k;
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}
public class KarteTester
{
  public static void main ( String[] args )
  {
	  Karte postkarte = new Feiertag( "Ann", "w" );
	    postkarte.gruss();                      //Feiertag gruss() aufrufen

	    postkarte = new Geburtstag( "Bob", "m", 55 );
	    postkarte.gruss();                      //Valentin gruss() aufrufen

	    postkarte = new Valentin( "Joan", "w", 30 );
	    postkarte.gruss();                      //Geburtstag gruss() aufrufen

  }
}