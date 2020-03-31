import java.util.Scanner;
public class SchleifeAufgabe3 
{
	public static void main (String[] args )
	  {
	    Scanner scan = new Scanner( System.in );
	    String wort1, wort2;
	    int laenge=30;
	    
	    System.out.println("Geben Sie das erste Wort ein:");
	    wort1 = scan.nextLine();
	    System.out.println("Geben Sie das zweite Wort ein:");
	    wort2 = scan.nextLine();
	    
	    System.out.print(wort1);
	    laenge = laenge - (wort1.length());
	    
	    while (laenge > 0 && laenge > wort2.length())
	    {
	    	 System.out.print(".");
	    	 laenge = laenge - 1;
	    }
	    
	    System.out.println(wort2);
	    
	  }
}
