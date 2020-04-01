import java.util.Scanner;
public class NameEcho 
{
	public static void main( String[] args)
	{
		String name;
		String vorname, nachname;
		int zaehler = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihren Namen ein:");
		name = scan.nextLine();
		
		while (name.charAt(zaehler) != ' ')
		{
			zaehler = zaehler + 1;
		}
		
		vorname = name.substring(0, zaehler);
		nachname = name.substring(zaehler+1, name.length());
		nachname = nachname.toUpperCase();
		
		System.out.println();
		System.out.println(vorname + " " + nachname);
		
	}
}
