public class Datentypen {
    
    public static void main(String[] args) {
        
        // Das ist ein einzeiliger Kommentar

        /* Das hier ist 
         * ein 
         * mehrzeiliger
         * Kommentar
         * Die Sternchen in jeder Zeile sind optional
         * Wichtig ist der Abschluss mit Sternchen und Forwardslash
         */
        
        /* 
            primitive Datentypen 
            einfache Datentypen 

            davon gibt es genau 8 verschiedene
        */ 

        /* Variablen für "ganze Zahlen" */

        // Byte (Werte 11111111 -> 256 / -128 bis 127) - 1 Byte
        // Deklaration/Erstellung der Variable foo und Zuweisung des Wertes 1
        byte myByte = 1;
        // byte foo = 1000; -> führt zu Fehler, da 1000 den Wertebereich eines Byte überschreitet
        System.out.println("Byte: " + myByte);

        // Short (Wertebereich ~ -32.000 bis 32.000) - 2 Byte
        short myShort = 1000;
        System.out.println("Short: " + myShort);

        // Integer (Wertebereich ~ -2.000.000.000 bis 2.000.000.000) - 4 Byte
        int myInt = 33000;
        System.out.println("Int: " + myInt);

        // Long (Wertebereich ~ -3 Trillionen bis 3 Trillionen) - 8 Byte
        //long myLong = 3000000000; -> wird als Integer interpretiert
        long myLong = 3000000000L;    // grosses oder kleines 'L' zur Kennzeichnung, dass es ein Long ist
        System.out.println("Long: " + myLong);

        /* Variablen für Gleitkommazahlen */

        // Float
        float myFloat = 2.34234234F;   // F oder f, damit es als Float und nicht als Double erkannt wird
        System.out.println("Float: " + myFloat);

        // Double - genauer als ein Float
        double myDouble = -5.12346738234;
        System.out.println("Double: " + myDouble);


        // Boolean - Wahrheitswert, entweder 'true' oder 'false' - 1 Byte
        boolean myBoolean;   // Deklaration / Erstellung
        myBoolean = false;   // Wertzuweisung / Benutzung
        System.out.println("Boolean: " + myBoolean);

        myBoolean = 2 < 1;  // Ausdruck wird zu 'false' evaluiert 
        System.out.println("Boolean aus Ausdruck: " + myBoolean);


        // Char - für *einzelne* Zeichen - 2 Byte
        // Wichtig: das Zeichen muss in *einfache* ('') Hochkommata eingeschlossen werden, nicht in doppelte ("")
        char myChar = 'c';
        System.out.println("Char: " + myChar);

        // myChar.    -> Primitives können keine Methoden oder Attribute aufrufen

        /* Komplexe Datentypen (Klassen) */
        String myString = "Huhuhuhu";
        System.out.println("String: " + myString);

        int stringlaenge = myString.length();
        String stringToUpper = myString.toUpperCase();
        System.out.println(stringlaenge);
        System.out.println(stringToUpper);

    }
    
}
