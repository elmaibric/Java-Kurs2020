import java.util.Scanner;
public class SchleifeAufgabe1 
{
	  public static void main (String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
	    int startwert, endwert;
	    
	    System.out.println("Startwert: ");
	    startwert = scan.nextInt();
	    System.out.println("Endwert: ");
	    endwert = scan.nextInt();
	    
	    while (startwert <= endwert)
	    {
	    	System.out.println(startwert);
	    	startwert = startwert + 1;
	    }
	  }
}
