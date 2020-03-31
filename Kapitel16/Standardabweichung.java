import java.util.Scanner;

public class Standardabweichung {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anzahlzahlen, zaehler=1;
		double n, durchschnittQ, durchschnitt2, summe1=0, summe2=0, SD;

		System.out.print("Wie viele Zahlen moechten Sie eingeben? ");
		anzahlzahlen = scan.nextInt();

		while (zaehler <= anzahlzahlen)
		{

			System.out.print("Geben Sie eine Zahl ein: ");
			n = scan.nextDouble();

			summe1 = summe1 + n;
			summe2 = summe2 + (n * n);
			zaehler = zaehler + 1;
		}

		durchschnittQ = summe2 / anzahlzahlen;
		durchschnitt2 = (summe1/anzahlzahlen) * (summe1/anzahlzahlen);

		SD = Math.sqrt(durchschnittQ - durchschnitt2);

		System.out.println("Die Standardabweichung betraegt: " + SD);
	}
}