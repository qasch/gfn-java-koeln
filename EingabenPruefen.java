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
        else 
        {
            System.out.println(zahl + " ist grösser als 10");
        }


        input.close();

    }
    
}
