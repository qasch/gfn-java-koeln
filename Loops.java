public class Loops {
    
    public static void main(String[] args) {
        
        int zahl = 8;
        
        // Kopfgesteuerte Schleife
        System.out.println("Kopfgesteuert: ");
        while (zahl < 10) {
            System.out.println(zahl);
            // zahl = zahl + 1;
            // zahl += 1;
            zahl++;                     // 10
        }

        // zahl = 8;
        // Fussgesteuerte Schleife
        System.out.println("Fussgesteuert: ");
        do {
            System.out.println(zahl);   // 10
            zahl++;                     // 11
        } while (zahl < 10);            // 11

        // Zählschleife
        System.out.println("Zähl-/For-Schleife: ");
        for(int i = 1; i <= 10;){
            System.out.println(i); 
        }
    }

}
