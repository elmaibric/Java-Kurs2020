import java.util.Scanner;
public class Summe 
{
	public static void main (String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
	    int n, zaehler=1;
	    double summe=0;
	    
	    System.out.println("Geben Sie n ein:");
	    n = scan.nextInt();
	    
	    while (n >= zaehler)
	    {
	    	summe = 1.0/zaehler + summe;
	    	zaehler = zaehler + 1;
	    }
	    
	    System.out.println("Die Summe ist: " + summe);
	    
	  }
}
