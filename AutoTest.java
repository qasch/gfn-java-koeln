class AutoTest {

    public static void main(String[] args) {

        // Objekte vom Typ Auto erzeugen
        Auto sportwagen = new Auto("Sportwagen", "gruen", 101, 250, true, 20);          
        Auto lieferwagen = new Auto("Lieferwagen", "weiss", 234111, 75, false, 32);

        System.out.println("---------------------------------------------------");
        showAuto(sportwagen);
        showGeschwindigkeit(sportwagen);
        System.out.println("Jetzt geben wir Sportwagen-Gas!");
        sportwagen.beschleunigen(20);
        showGeschwindigkeit(sportwagen);

        System.out.println("---------------------------------------------------");

        showAuto(lieferwagen);
        showGeschwindigkeit(lieferwagen);
        System.out.println("Der Lieferwagen beschleunigt weniger gut.");
        lieferwagen.beschleunigen(5);
        showGeschwindigkeit(lieferwagen);


        if(!sportwagen.getUnfallfrei()) {
            System.out.println("Wir müssen in die *Sportwagen*-Wetkstatt!");
        }

        if(!lieferwagen.getUnfallfrei()) {
            System.out.println("Wir müssen in die *Lieferwagen*-Wetkstatt!");
        }
        System.out.println("---------------------------------------------------");
    }

    // Statische Methoden sind Methoden, die die Klasse direkt aufrufen kann.
    // Es wird also kein Objekt benötigt, um die Methode aufzurufen.
    // Dies kann z.B. sinnvoll sein, um Redundanzen zu vermeiden (Vergleich mit 
    // getUnfallfrei Methoden oben).
    public static void showAuto(Auto a){
        System.out.println("Unser " + a.getBezeichnung() + " ist " + a.getFarbe() + 
            " und hat eine Leistung von " + a.getLeistung() + " PS.");

    }

    public static void showGeschwindigkeit(Auto a){
        System.out.println("Die aktuelle Reisegeschwindigkeit des " + a.getBezeichnung() + "s beträgt: " + a.getGeschwindigkeit() + " km/h.");
    }

}