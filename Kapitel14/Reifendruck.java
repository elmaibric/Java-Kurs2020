import java.util.Scanner;
public class Reifendruck 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int vornerechts, vornelinks, hintenrechts, hintenlinks;
		boolean druckOK = true;
		
		System.out.println("Reifendruck: rechter Vorderreifen");
		vornerechts = scan.nextInt();
		if (!(vornerechts >= 35 && vornerechts <= 45))
		{
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs");
			druckOK = false;
		}
		
		System.out.println("Reifendruck: linker Vorderreifen");
		vornelinks = scan.nextInt();
		if (!(vornelinks >= 35 && vornelinks <= 45))
		{
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs");
			druckOK = false;
		}
		
		System.out.println("Reifendruck: rechter Hinterreifen");
		hintenrechts = scan.nextInt();
		if (!(hintenrechts >= 35 && hintenrechts <= 45))
		{
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs");
			druckOK = false;
		}
		System.out.println("Reifendruck: linker Hinterreifen");
		hintenlinks = scan.nextInt();
		if (!(hintenlinks >= 35 && hintenlinks <= 45))
		{
			System.out.println("Warnung: Der Reifendruck ist außerhalb des erlaubten Bereichs");
			druckOK = false;
		}
		
		if (vornerechts <= (vornelinks+3) && vornerechts >= (vornelinks-3) &&
			vornelinks <= (vornerechts+3) && vornelinks >= (vornerechts-3) &&
			hintenrechts <= (hintenlinks+3) && hintenrechts >= (hintenlinks-3) &&
			hintenlinks <= (hintenrechts+3) && hintenlinks >= (hintenrechts-3)&& druckOK == true)
		System.out.println("Reifendruck ist OK");
		else
		System.out.println("Reifendruck ausgleichen.");
	}
}
