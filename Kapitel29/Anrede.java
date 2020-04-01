import java.util.*;
public class Anrede 
{
	public static void main( String[] args)
	{
		String eingabe = "a";
		String frau = "Ms.";
		String herr = "Mr.";
		String ausgabe = null;
		
		Scanner scan = new Scanner(System.in);
		
		while (eingabe.length() != 0)
		{
		System.out.println("Geben Sie einen Namen ein:");
		eingabe = scan.nextLine(); 
	
			if (eingabe.startsWith("Amy") || eingabe.startsWith("Buffy") || eingabe.startsWith("Cathy"))
			{
				System.out.println(frau + " " + eingabe + "\n");
			}
			else if (eingabe.startsWith("Elroy") || eingabe.startsWith("Fred") || eingabe.startsWith("Graham"))
			{
				System.out.println(herr + " " + eingabe + "\n");
			}
			else
				System.out.println(eingabe);
		}
	}
}
