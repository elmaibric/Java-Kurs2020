import java.util.*;
class HalloObjekt
{
	String mitteilung;
	int i;
  
	HalloObjekt( String mitteilung )
	{
		this.mitteilung = mitteilung;
	}
  
	HalloObjekt( HalloObjekt einHalloObjekt )
	{
	  // initialisieren Sie die Variable mitteilung des neuen Objekts
	  // mit der Variablen mitteilung des einHalloObjekt-Parameters
		String str = new String(einHalloObjekt.mitteilung);
	}
	
  void morgengruss()
  {
	  System.out.println("Guten Morgen Welt!");
  }
  
  void abendgruss()
  {
	  System.out.println("Guten Abend Welt!");
  }
  
  void sprich()
  {
//	while (i < mitteilung.length())
//	{
    System.out.println(mitteilung);
//  i = i + 1;
//	}
  }
  
  void gruss()
  {
	  System.out.println();
	  System.out.println(mitteilung);
  }
}

class HalloTester
{
  public static void main ( String[] args )
  {
	  String message;
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Geben Sie die Mitteilung ein:");
	  message = scan.nextLine();
	  
	  HalloObjekt einObjekt = new HalloObjekt(message);
	  HalloObjekt objekt2 = new HalloObjekt(einObjekt.mitteilung);
	  
	  einObjekt.sprich();
	  objekt2.sprich();
	  
//	  einObjekt.morgengruss();
//	  einObjekt.abendgruss();
//	  einObjekt.sprich();
  }
}