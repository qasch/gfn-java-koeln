import java.util.Scanner;

public class EinUndAusgabe {
    
    public static void main(String[] args){

        // Erzeugung des Objekts 'input' vom Datentyp 'Scanner'
        Scanner input = new Scanner(System.in);
        // Ausgabe, Aufforderung, etwas einzugeben
        System.out.println("Bitte gib irgendetwas ein: ");
        // Eingabe wird in Variable 'eingabe' gespeichert
        String eingabe = input.nextLine(); 
        // Ausgabe 
        System.out.println("Du hat folgendes eingegeben: " + eingabe);
        // guter Stil: Scanner schliessen
        input.close();

    }
    
}
