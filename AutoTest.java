class AutoTest {

    public static void main(String[] args) {
        Auto sportwagen = new Auto();          
        sportwagen.farbe = "gruen";
        sportwagen.kilometerstand = 123;
        sportwagen.leistung = 200;

        System.out.println("Unser Sportwgen ist " + sportwagen.farbe + " und hat eine Leistung von " + sportwagen.leistung + " PS.");
    }

}