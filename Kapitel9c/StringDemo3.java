
public class StringDemo3 
{
	public static void main ( String[] args )
	  {
	    String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt
	    
	    int Parameter1 = 0;
		int Parameter2 = str.length()-1;
		
	    String sub = str.substring(Parameter1,str.length()); // erzeuge ein neues Objekt aus dem Original

	    System.out.println( sub );
	  }
}
