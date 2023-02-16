import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayIndexOutOfBoundsException;

class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: "); 

        // Exception Handling mit try - catch - Block
        try {
            // Code der ausgeführt werden soll
            // Code der versucht wird ausgeführt zu werden
            int zahl = sc.nextInt();
            System.out.println("Du hast die Zahl " + zahl + " eingegeben.");

            int[] zahlen = new int[4];
            // zahlen[4] = zahl;   // Versuch, auf das 5. Element zuzugreigen (gibt aber nur 4)
            zahlen[3] = zahl;  
        } catch (InputMismatchException ime) {
            // Code der ausgeführt wird, wenn eine Exception auftritt
            System.out.println("Du sollst eine Zahl eingeben, du Popel!");
            // System.out.println("Es ist folgender Fehler aufgetreten: " + ime);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Fehlerhagter Zugriff auf Arryay-Element: " + ai);
        } catch (Exception ex) {
            System.out.println("Es ist folgender Fehler aufgetreten: " + ex);
        } finally {
            // Code, der auf jeden Fall ausgeführt wird, *egal* ob eine Exception auftritt oder nicht
            sc.close();
            System.out.println("Ich stehe im finally Block und werde immer ausgeführt");
        }

        System.out.println("Programmende");


    }

}