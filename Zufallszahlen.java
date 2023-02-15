import java.util.Random;

class Zufallszahlen {
    public static void main(String[] args) {

        int[] zufallszahlen = new int[10];
        Random rand = new Random();

        for(int i = 0; i < zufallszahlen.length; i++) {
            // zufallszahlen[i] = (int) (Math.random() * 10);   // mit Math.random()
            zufallszahlen[i] = rand.nextInt(50);                // mit java.util.Random
        }
    
        for(int zahl : zufallszahlen){
            System.out.println(zahl);
        }
    }
}