import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto( double startTacho ) // double endTacho, double galls  )
  {
    startMeilen = startTacho;
//    endMeilen   = endTacho;
//    gallonen    = galls;
  }

  // Methoden
  void auftanken( double aktTacho, double gallonen )
  {
	  endMeilen = aktTacho;
	  this.gallonen = gallonen;
  }
  
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen ; 
  }
  
  boolean benzinschwein()
  {
	  if (berechneMPG() < 15.0)
		  return true;
	  else
		  return false;
  }
  
  boolean sparauto()
  {
	  if (berechneMPG() > 30)
		  return true;
	  else
		  return false;
  }

}

class MeilenProGallone2
{
  public static void main( String[] args )
  {
	Scanner scan = new Scanner(System.in);
	double nowmeilen, gallonen;
	String ende = "n";
	
	Auto auto = new Auto(0.0);
	
	while (ende.equals("n"))
	{
		System.out.println("+++ Besuch der Tankstelle +++");
		System.out.println("alter Tachometerstand: " + auto.startMeilen);
		System.out.println("Aktuellen Tachometerstand eingeben: ");
		nowmeilen = scan.nextDouble();
		System.out.println("Anzahl der Gallonen fuer die Tankfuellung: ");
		gallonen = scan.nextDouble();
	
		auto.auftanken(nowmeilen, gallonen);
		
		System.out.println();
		System.out.print( "Meilen pro Gallonen: " + auto.berechneMPG());
    
		if (auto.benzinschwein() == true)
			System.out.println(" Autotyp: Benzinschwein!");
    
		if (auto.sparauto() == true)
			System.out.println(" Autotyp: Sparauto!");
		
		auto.startMeilen = auto.endMeilen;
		
		System.out.println("Programm beenden <j>a <n>ein?");
		ende = scan.next();
    }
  }
}