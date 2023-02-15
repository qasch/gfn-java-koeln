class Funktionen {

    public static void main(String[] args) {
        
        // Aufruf / Benutzung der Funktion
        int rueckgabe = addiere(5, 23);    // Aufruf mit zwei Argumenten
        System.out.println(rueckgabe);  
        
        // Wiederholter Aufruf mit verschiedenen Argumenten
        System.out.println(addiere(1234, 1234));  
        System.out.println(addiere(14, 12));  
        System.out.println(addiere(34, 14));  
        

        double division = dividiere();
        System.out.println(division);  

        schnarche();
    }

    // Deklaration der Funktion mit Parametern
    static int addiere(int zahl1, int zahl2) {
        int summe = zahl1 + zahl2;

        return summe;
    }

    // Deklaration der Funktion ohne Parameter
    static double dividiere() {
        double zahl1 = 7;
        double zahl2 = 23;
        double ergebnis = zahl1 / zahl2;

        return ergebnis;
    }

    static void schnarche() {
        System.out.println("Zzzzzzzzz...");
    }

}