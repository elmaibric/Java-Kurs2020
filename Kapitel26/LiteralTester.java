
public class LiteralTester 
{
	public static void main ( String[] args)
	{
		String str1;
		String str2;
		String str3;
		String str4;
		int objekte=0;
		
		str1 = "Bo, die Katze";
		str2 = "Bo, die Katze";
		
		str3 = new String ("Fred, der Hund");
		str4 = new String ("Fred, der Hund");
		
		if (str1 == str2)
//			System.out.println("str1 und str2 haben dasselbe Objekt.");
			objekte = objekte + 1;
		else
			objekte = objekte + 2;
		
		if (str3 == str4)
//			System.out.println("Sollte nicht ausgegeben werden.");
			objekte = objekte + 1;
		else
			objekte = objekte + 2;
		
		System.out.println("Es wurden " + objekte + " Objekte erzeugt.");
	}
}
