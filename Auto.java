class Auto {

    // Eigenschaften - Attribute
    String farbe;
    String treibstoffart;
    String marke;
    int leistung;
    int kilometerstand;
    int geschwindigkeit;
    int tankinhalt;
    boolean unfallfrei;

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