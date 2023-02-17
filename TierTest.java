class TierTest {
    public static void main(String[] args) {
        // Tier tier = new Tier();
        // TierTest.showTier(tier);
        
        Hund gretl = new Hund("Gretl", 9, "Labrador");
        TierTest.showTier(gretl);
        gretl.gibLaut();

        Hund stanni = new Hund();
        TierTest.showTier(stanni);
        stanni.gibLaut();

        Katze tom = new Katze("Tom", 3, "Perserkatze", 7);
        TierTest.showTier(tom);
        tom.gibLaut();

        Katze emma = new Katze("Emma", 10);
        TierTest.showTier(emma);
        emma.gibLaut();

    }

    private static void showTier(Tier t){
        System.out.println("Name: " + t.getName());
        System.out.println("Alter: " + t.getAlter());
        System.out.println("Art: " + t.getArt());
    }
}