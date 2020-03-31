import java.util.Scanner;
public class MeilenproGallone 
{
	 public static void main (String[] args )
	  {
		 
		Scanner scan = new Scanner(System.in);
		int anfangmeilen=0, endmeilen=0, gallonen=0;
		double meilenprogallone=0;
		
		System.out.println("Programm Meilen pro Gallone");
		
		while (anfangmeilen != -1)
		{
		System.out.println("Anfangsstand Meilen:");
		anfangmeilen = scan.nextInt();
		
		if (anfangmeilen != -1)
		{
		System.out.println("Endstand Meilen:");
		endmeilen = scan.nextInt();
		System.out.println("Gallonen");
		gallonen = scan.nextInt();
		
		meilenprogallone = ((endmeilen + 0.0) - (anfangmeilen + 0.0)) / (gallonen + 0.0);
		System.out.println("Meilen pro Gallone: " + meilenprogallone);
		System.out.println(" ");
		}
		}
		System.out.println("Bye");
	  }
}
