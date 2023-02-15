class Felder {
    // Felder sind Datenstrukturen, die mehrere Werte aufnehmen können
    // z.B. Arrays (z.B. Lists in Python)

    public static void main(String[] args) {
    
        // Deklaration des Arrays myInArray, welches 5 Werte aufnehmen kann
        // Die Grösse des Arrays *muss* bei der Deklaration mit angegeben werden
        // und ist im Nachhinein nicht mehr änderbar
        int[] myIntArray = new int[6];
        // Zuweisung von Werten
        myIntArray[0] = 11;
        myIntArray[1] = 22;
        // myIntArray[2] = 33;

        // Ausgabe aller Elemente des Arrays:
        System.out.println("Ausgabe mit for-Loop:");
        for(int i = 0; i < myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }

        String[] myStringArray = {"eins", "zwei", "drei"};

        System.out.println("Ausgabe mit dem Enhanced-for-Loop / for-each-Loop:");
        for(String element : myStringArray){
            System.out.println(element);
        } 

        // System.out.println(myIntArray);
        // print(myList);  -> [11, 22, 33, 0, 0] 


        // Mehrdimensionalen Arrays
        int x = 5;
        int y = 5;
        String[][] zweiDimensionalesArray = new String[x][y];

        zweiDimensionalesArray[0][0] = "x0 y0";
        zweiDimensionalesArray[0][1] = "x0 y1";
        zweiDimensionalesArray[0][2] = "x0 y2";

        zweiDimensionalesArray[1][0] = "x1 y0";
        zweiDimensionalesArray[1][1] = "x1 y1";
        zweiDimensionalesArray[1][2] = "x1 y2";

        System.out.println("Mehrdimensionales Array:");
        for(int i = 0; i < zweiDimensionalesArray.length; i++){
            for(int j = 0; j < zweiDimensionalesArray.length; j++){
                System.out.println(zweiDimensionalesArray[i][j]);
            }
        }

    }

}