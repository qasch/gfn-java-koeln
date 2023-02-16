class AutoTest {

    public static void main(String[] args) {
        // Objekt vom Typ Auto erzeugen
        Auto sportwagen = new Auto("Sportwagen", "gruen", 101, 250, true, 20);          

        // System.out.println("Unser " + sportwagen.getBezeichnung() + " ist " + sportwagen.getFarbe() + 
        //     " und hat eine Leistung von " + sportwagen.getLeistung() + " PS.");

        showAuto(sportwagen);

        System.out.println("aktuelle Geschwindigkeit: " + sportwagen.getGeschwindigkeit());
        System.out.println("Wir geben Gas!");
        sportwagen.beschleunigen(20);
        System.out.println("aktuelle Geschwindigkeit: " + sportwagen.getGeschwindigkeit());

        if(!sportwagen.getUnfallfrei()) {
            System.out.println("Wir müssen in die Wetkstatt!");
        }


        // Auto lieferwagen = new Auto();          
        // lieferwagen.farbe = "weiss";
        // lieferwagen.kilometerstand = 108234;
        // lieferwagen.leistung = 75;

        // System.out.println("Unser " + lieferwagen.bezeichnung + " ist " + lieferwagen.farbe + 
        //     " und hat eine Leistung von " + lieferwagen.leistung + " PS.");

        // System.out.println("aktuelle Geschwindigkeit: " + lieferwagen.geschwindigkeit);
        // System.out.println("Wir geben Gas!");
        // lieferwagen.beschleunigen(5);
        // System.out.println("aktuelle Geschwindigkeit: " + lieferwagen.geschwindigkeit);

        // if(!lieferwagen.unfallfrei) {
        //     System.out.println("Wir müssen in die Wetkstatt!");
        // }


    }

    public static void showAuto(Auto a){
        System.out.println("Unser " + a.getBezeichnung() + " ist " + a.getFarbe() + 
            " und hat eine Leistung von " + a.getLeistung() + " PS.");

    }

}