class Auto {

    // Eigenschaften - Attribute - Klassenvariablen
    private String farbe;        // null
    private String treibstoffart;
    private String marke;
    private String bezeichnung;
    private int leistung;
    private int kilometerstand;  // 0
    private int geschwindigkeit; // 0
    private int tankinhalt;
    private boolean unfallfrei;  // false

    // Standard Konstruktor
    public Auto() {

    }

    // eigener Konstruktor
    public Auto(String bezeichnung, String farbe, int kilometerstand, int leistung, boolean unfallfrei, int tankinhalt) {
        this.bezeichnung = bezeichnung;
        this.setFarbe(farbe);
        this.kilometerstand = kilometerstand;
        this.leistung = leistung;
        this.unfallfrei = unfallfrei;
        this.setTankinhalt(tankinhalt);
    }

    // Getter und Setter
    // Getter für Attribut farbe
    public String getFarbe() {
        return this.farbe;
    }

    // Setter für Attribut farbe
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    public int getLeistung(){
        return this.leistung;
    }

    public String getBezeichnung(){
        return this.bezeichnung;
    }

    // Getter für Attribut farbe
    public int getTankinhalt() {
        return this.tankinhalt;
    }

    // Setter für Attribut farbe
    public void setTankinhalt(int liter) {
        if(liter < 0) {
            System.out.println("Der Tankinhalt darf nicht negativ sein.");
        } else {
            this.tankinhalt = liter;
        }
    }

    public int getKilometerstand(){
        return this.kilometerstand;
    }

    public boolean getUnfallfrei(){
        return this.unfallfrei;
    }

    public int getGeschwindigkeit(){
        return this.geschwindigkeit;
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