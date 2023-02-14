import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib eine ganze Zahl ein: ");

        int zahl = input.nextInt();

        System.out.println("Du hast folgendes eingegeben: " + zahl); 


        // switch - case
        switch (zahl) {
            case 1: 
                System.out.println("Montag");
                break;
            case 2: 
                System.out.println("Dienstag");
                break;
            case 3: 
                System.out.println("Mittwoch");
                break;
            case 4: 
                System.out.println("Donnerstag");
                break;
            case 5: 
                System.out.println("Freitag");
                break;
            case 6: 
                System.out.println("Samstag");
                break;
            case 7: 
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("gibt's nischt.");

        }

        input.close();
    }
}
