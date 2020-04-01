import java.awt.*;
import java.util.*;
public class PointObjekte 
{
	public static void main( String[] args)
	{
		
		int x1, x2, y1, y2;
		Point a = new Point();
		Point b = new Point();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wert x1:");
		x1 = scan.nextInt();
		
		System.out.println("Wert x2:");
		x2 = scan.nextInt();
		
		System.out.println("Wert y1:");
		y1 = scan.nextInt();
		
		System.out.println("Wert y2:");
		y2 = scan.nextInt();
		
		a.move(x1, y1);
		b.move(x2, y2);
		
		if (a.equals(b))
			System.out.println("Die Koordinaten der beiden Punkte sind gleich: ");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
	}
}
