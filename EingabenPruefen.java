import java.util.Scanner;

public class EingabenPruefen {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib eine ganze Zahl ein: ");

        int zahl = input.nextInt();

        System.out.println("Du hast folgendes eingegeben: " + zahl);

        // Verzweigung / If-Statement ...
        if(zahl < 10) 
        {
            System.out.println(zahl + " ist kleiner als 10");
        } 
        else if(zahl == 10) 
        {
            System.out.println(zahl + " ist gleich 10");
        } 
        else if (zahl > 10 && zahl < 50)       
        {
            System.out.println(zahl + " liegt zwischen 10 und 50");
        }
        else if (zahl == 50)       
        {
            System.out.println(zahl + " ist gleich 50");
        }
        else if (zahl > 50 && zahl < 100)       
        {
            System.out.println(zahl + " liegt zwischen 50 und 100");
        }
        else 
        {
            System.out.println(zahl + " ist gleich oder grösser 100");
        }

        // || - logische ODER Verknüpfung
        // && - logische UND Verknüpfung

        input.close();

    }
    
}
