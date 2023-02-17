abstract class Tier {

    private String name;
    private int alter;
    private String art;

    public Tier(String name, int alter, String art){
        setName(name);
        setAlter(alter);
        setArt(art);
    }
    public Tier(){}

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return this.alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

    public String getArt(){
        return this.art;
    }
    public void setArt(String art){
        this.art = art;
    }

    // Abstrakte Mehtode
    public abstract void gibLaut();
    
}

class Hund extends Tier {
    // Konstruktor der Klasse Hund
    public Hund(String name, int alter, String art){
        // Aufruf des Konstruktors der Elternklasse Tier
        super(name, alter, art);
    }
    public Hund(){
        super.setName("Standardhund");
        super.setAlter(0);
        super.setArt("Standardart");
    }

    public void gibLaut(){
        System.out.println("wuffwuff");
    }
}

class Katze extends Tier {

    // zusätzliches Attribut der Klasse Katze
    private int anzahlLeben;

    public Katze(String name, int alter, String art, int leben){
        super(name, alter, art);
        this.anzahlLeben = leben;
    }
    public Katze(String name, int alter){
        super.setName(name);
        super.setAlter(alter);
    }

    // Überschreibt die Methode der Elternklasse
    public void gibLaut(){
        System.out.println("Miau");
    }

}