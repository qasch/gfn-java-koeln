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
                System.out.println("zahl = 1");
                break;
            case 2: 
                System.out.println("zahl = 2");
                break;
            case 3: 
                System.out.println("zahl = 3");
                break;

        }
    }
}
