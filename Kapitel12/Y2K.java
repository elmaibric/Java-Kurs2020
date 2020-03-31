import java.util.Scanner;
public class Y2K 
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int geburtsjahr, aktuellesjahr, alter;
		
		System.out.println("Geburtsjahr:");
		geburtsjahr = scan.nextInt();
		System.out.println("Aktuelles Jahr:");
		aktuellesjahr = scan.nextInt();
		
		alter = aktuellesjahr - geburtsjahr;
		
		if (alter < 0)
		{
			alter = alter + 100;
		}
		else{}
		
		System.out.println("Ihr Alter ist: " + alter);
	}
}
