import java.util.Scanner;
public class SchleifeAufgabe2 
{
	 public static void main (String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
	    String wort;
	    int laenge;
	    
	    System.out.println("Geben Sie ein Wort ein: ");
	    wort = scan.nextLine();
	    laenge = wort.length();
	    
	    while (laenge > 0)
	    {
	    	System.out.println(wort);
	    	laenge = laenge - 1;
	    }
	  }
}
