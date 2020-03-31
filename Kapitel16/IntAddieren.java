import java.util.Scanner;
public class IntAddieren 
{
	public static void main (String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
	    int wiederholungen, zahlen, summe=0;
	    
	    System.out.println("Wie viele Integer sollen addiert werden: ");
	    wiederholungen=scan.nextInt();
	    
	    while (wiederholungen > 0)
	    {
	    	System.out.println("Geben Sie einen Integer ein: ");
	    	zahlen=scan.nextInt();
	    	summe = summe + zahlen;
	    	wiederholungen = wiederholungen - 1;
	    }
	    System.out.println("Die Summe ist " + summe);
	  }
}
