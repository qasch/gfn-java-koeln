class Auto {

    // Eigenschaften - Attribute - Klassenvariablen
    String farbe;        // null
    String treibstoffart;
    String marke;
    String bezeichnung;
    int leistung;
    int kilometerstand;  // 0
    int geschwindigkeit; // 0
    int tankinhalt;
    boolean unfallfrei;  // false

    // Standard Konstruktor
    public Auto() {

    }

    // eigener Konstruktor
    public Auto(String bezeichnung, String farbe, int kilometerstand, int leistung, boolean unfallfrei) {
        this.bezeichnung = bezeichnung;
        this.farbe = farbe;
        this.kilometerstand = kilometerstand;
        this.leistung = leistung;
        this.unfallfrei = unfallfrei;
    }

    // Funktionalitäten - Methoden
    void beschleunigen(int faktor){
        // verändert geschwindigkeit
        geschwindigkeit = geschwindigkeit + faktor;
    }

    void bremsen(int faktor){
        // verändert geschwindigkeit
        geschwindigkeit = geschwindigkeit - faktor;
    }

    void tanken(int liter){
        // beachte treibstoffart
        // verändert tankinhalt
        tankinhalt += liter;
    }
    
    void hupen() {
        System.out.println("Honk, honk!");
    }

}