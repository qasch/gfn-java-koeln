import java.util.Scanner;

public class EinUndAusgabe {
    
    public static void main(String[] args){

        // Erzeugung des Objekts 'input' vom Datentyp 'Scanner'
        // 'input' ist hier der Name einer Variablen und frei wählbar
        Scanner input = new Scanner(System.in);
        // Ausgabe, Aufforderung, etwas einzugeben
        System.out.println("Bitte gib irgendetwas ein: ");
        // Eingabe wird in Variable 'eingabe' gespeichert
        String eingabe = input.nextLine(); 
        // Ausgabe 
        System.out.println("Du hat folgendes eingegeben: " + eingabe);


        System.out.println("Bitte gib eine ganze Zahl ein: ");
        int zahl = input.nextInt();

        zahl = zahl + 5;
        System.out.println("Zahl plus 5 = " + zahl);

        // guter Stil: Scanner schliessen
        input.close();

    }
    
}
