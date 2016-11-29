
public class Craps {
	public static void main (String[]args){
	
	// Umtausch vom Euro in Jetons
		final int maximaleinzahlung = 50;
		final int errechnungJetons = 4;
		int rest;
		int anzJetons;
		int rotJetons;
		int blauJetons;
		int momentanGeld;
		char ja = 'j';
		char nein = 'n';
		
		System.out.println("Bitte geben Sie ein, wie viel Geld Sie einzahlen möchten: ");
		
		int eingabe = StaticScanner.nextInt();
		if (eingabe <= maximaleinzahlung){
			anzJetons = (eingabe / errechnungJetons);
			rest = eingabe % errechnungJetons;
		
			rotJetons = anzJetons;
			blauJetons = anzJetons + rest;
			
			
			
			
			System.out.println("Sie haben nun " + rotJetons + " rote Jetons (im Wert von 1 €) und " + blauJetons + " blaue Jetons (im Wert von 3 €).");
			
		}else{
			System.out.print("Bitte geben Sie einen Wert unter 51€ ein.");
			
		}
		// Abfrage, ob Spielregeln gelesen werden wollen. 
		System.out.println("Sie spielen das Spiel Craps. Möchten Sie die Spielregeln lesen? Geben Sie \"j\" für Ja und \"n\" für Nein ein.");
		char antwort = StaticScanner.nextChar();
		
		if (antwort == ja){
		
		System.out.println();
		System.out.println("Spielregeln");
		System.out.println();
		System.out.println("Sie spielen Craps. Da Sie der Shooter sind, können Sie gleichzeitig setzen und würfeln.");
		System.out.println("Sie dürfen nur weiterspielen, wenn Sie gewonnen haben. Wenn Sie sich zum Weiterspielen  entscheiden, müssen Sie neu setzen. ");
		System.out.println("Sie würfeln mit zwei Würfeln, deren Augenzahl zusammengezählt wird.");
		
		System.out.println();
		System.out.println("Regel beim ersten Wurf ");
		System.out.println();
		System.out.println("‣  bei der Augensumme 7 oder 11, haben Sie ein Natural und gewinnen sofort. ");
		System.out.println("‣  bei der Augensumme 2, 3 oder 12, haben Sie einen Crap und verlieren sofort. ");
		System.out.println("‣  bei der Augensumme 4, 5, 6, 8, 9 oder 10, haben Sie einen Point, und  würfeln ein weiteres Mal. ");
		
		System.out.println();
		System.out.println("Regeln ab dem zweiten Wurf: ");
		System.out.println();
		System.out.println("‣  werfen Sie dieselbe Augensumme wie im ersten Wurf, also den Point, gewinnen Sie.");
		System.out.println("‣  bei der Augensumme 7, verlieren Sie.");
		System.out.println("‣  bei irgendeiner anderen Augensumme, würfeln Sie ein weiteres mal.");	
		
		} else {
		System.out.println("Okay, fangen wir mit dem Spiel an: ");	
		}
		
		// Spielrunde
		
		
		// Umtauschen von Jetons in Euro
		 System.out.println( "Möchten Sie das Kasino verlassen und die Jetons in Euro wechseln lassen.");
		 char aussage = StaticScanner.nextChar();
		
		if(aussage == ja){
			
		} else{
			System.out.print("Okay, viel Spaß beim weiterspielen.");
		}
	}
}
