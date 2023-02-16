class Auto {

    /* --- Eigenschaften - Attribute - Klassenvariablen ---
    *
    * Klassenattribute werden in der Regel alle als private oder protected deklariert, 
    * so dass kein Zugriff (lesend/schreibend) von ausserhalb der Klasse mehr möglich ist.
    *
    * Der Zugriff erfolgt dann über Getter und Setter (s.u.).
    * 
    * Wenn bei *Klassenvariablen* keine direkte Initialisierung erfolgt, werden die Variablen 
    * mit Initialwerten versehen (String: null, int: 0, double: 0.0, boolean: false ...).
    */
    private String bezeichnung;
    private String farbe;        // null
    private int kilometerstand;  // 0
    private int leistung;
    private boolean unfallfrei;  // false
    private int tankinhalt;
    private int geschwindigkeit; // 0

    /* 
     * --- Konstruktoren ---
     * 
     * Konstruktoren werden bei der Objekterzeugung aufgerufen. Sie erstellen kein Objetk, sondern 
     * versetzen es in einen bestimmten Ausgangszustand.
     * 
     * Konstruktoren können _überladen_ werden. D.h. es kann mehr als einen Konstruktor pro Klasse geben.
     * Die Konstruktoren müssen sich dann aber in der Parameterlist unterscheiden (unterschiedliche Anzahl
     * oder Datentypen).
     * 
     * Wird *kein eigener* Konstruktor erstellt, stellt Java einen leeren Standardkonstruktor zur Verfügung.
     */

    // Standard Konstruktor
    public Auto() {

    }

    // eigener Konstruktor
    // Sinvollerweise nutzen wir die Setter auch hier in unserem Konstruktor
    public Auto(String bezeichnung, String farbe, int kilometerstand, int leistung, boolean unfallfrei, int tankinhalt) {
        this.setBezeichnung(bezeichnung);
        this.setFarbe(farbe);
        this.setKilometerstand(kilometerstand);
        this.setLeistung(leistung);
        this.setUnfallfrei(unfallfrei);
        this.setTankinhalt(0);
        this.setGeschwindigkeit(0);
    }

    /* 
     * -- Getter und Setter ---
     * 
     * Mit Gettern kann auf geschützte (z.B. als private deklarierte) Attribute 
     * auch von ausserhalb der Klasse zugegriffen werden.
     * 
     * Setter ermöglichen es uns, von ausserhalb der Klasse Attirbutwerte zu ändern
     * oder nur unter bestimmten Bedingungen zu setzen (siehe setTankinhalt).
     */ 

    public String getBezeichnung(){
        return this.bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getFarbe() {
        return this.farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    
    public int getLeistung(){
        return this.leistung;
    }
    public void setLeistung(int leistung){
        this.leistung = leistung;
    }

    public int getTankinhalt() {
        return this.tankinhalt;
    }
    // Setter können/sollten eine gewisse Logik enthalten, so dass 
    // z.B. kein negativer Tankinhalt gesetzt werden kann.
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
    public void setKilometerstand(int kilometerstand){
        if(kilometerstand < 0) {
            System.out.println("Kilometerstand darf nicht negativ sein.");
        } else {
            this.kilometerstand = kilometerstand;
        }
    }

    public boolean getUnfallfrei(){
        return this.unfallfrei;
    }
    public void setUnfallfrei(boolean unfallfrei){
        this.unfallfrei = unfallfrei;
    }

    public int getGeschwindigkeit(){
        return this.geschwindigkeit;
    }
    public void setGeschwindigkeit(int geschwindigkeit){
        if(geschwindigkeit < 0){
            System.out.println("Geschwindigkeit darf nicht negativ sein.");
        } else {
            this.geschwindigkeit = geschwindigkeit;
        }
    }


    /* 
     * ---  Methoden ---
     *  
     * Methoden sind die Funktionalitäten von Klassen.
     * Methoden werden von den jeweiligen Objekten aufgerufen (Punkt-Notation)
     * 
    */

    public void beschleunigen(int faktor){
        // verändert geschwindigkeit
        geschwindigkeit = geschwindigkeit + faktor;
    }

    public void bremsen(int faktor){
        // verändert geschwindigkeit
        geschwindigkeit = geschwindigkeit - faktor;
    }

    public void tanken(int liter){
        // beachte treibstoffart
        // verändert tankinhalt
        tankinhalt += liter;
    }
    
    public void hupen() {
        System.out.println("Honk, honk!");
    }

    public void showGeschwindigkeit(){
        System.out.println("Die aktuelle Reisegeschwindigkeit beträgt: " + this.getGeschwindigkeit() + " km/h.");
    }

}