class Plaetzchen
{

  // Instanzvariablen
  String sorte;
  // weitere Instanzvariablen hier
  String groesse;
  String form;
  Boolean verzierungJaNein;
  String verzierung;
  // Instanzmethode
  public void ausgeben()
  {
      // gibt Informationen über die Plätzchen aus z.B.
      // Sorte Kokos, Groesse mittel, Form rund  
	  if (verzierungJaNein == true)
		  verzierung = "ja";
	  else
		  verzierung = "nein";
	  
	  System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung " + verzierung);
  }

  // Test der Klasse Plaetzchen
  public static void main(String[] args)
  {
    /*
       (1) Erzeugen Sie mit dem new-Operator ein Objekt der Klasse Plaetzchen.
           Plaetzchen plaetzchen1 = new Plaetzchen(); // Der Standardkonstruktor wird von Java zur Verfügung gestellt.
       (2) Weisen Sie über die Punktnotation referenzvariable.instanzvariable
           den Instanzvariablen des Objekts Werte zu.
       (3) Lassen Sie dann das Plaetzchen-Objekt seine Methode ausgeben() aufrufen.
       (4) Testen Sie Ihr Programm.
       (5) Erzeugen Sie zwei weitere Plaetzchen-Objekte und verfahren Sie wie oben.
   */
	  Plaetzchen plaetzchen1 = new Plaetzchen();
	  plaetzchen1.sorte = "Kokos";
	  plaetzchen1.groesse = "mittel";
	  plaetzchen1.form = "rund";
	  plaetzchen1.verzierungJaNein = false;
	  
	  Plaetzchen plaetzchen2 = new Plaetzchen();
	  plaetzchen2.sorte = "Affennuss";
	  plaetzchen2.groesse = "klein";
	  plaetzchen2.form = "rund";
	  plaetzchen2.verzierungJaNein = false;
	  
	  Plaetzchen plaetzchen3 = new Plaetzchen();
	  plaetzchen3.sorte = "Honigkuchen";
	  plaetzchen3.groesse = "gross";
	  plaetzchen3.form = "rechteckig";
	  plaetzchen3.verzierungJaNein = true;
	  
	  System.out.println("+++ Plaetzchenliste +++");
	  System.out.println(" ");
	  plaetzchen1.ausgeben();
	  plaetzchen2.ausgeben();
	  plaetzchen3.ausgeben();
	  
  }
}