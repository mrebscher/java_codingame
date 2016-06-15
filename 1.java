import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {


public static int znajdzMax(int[] wejscie) {

int max = 0;  

for (int i = 1; i < wejscie.length; i++) {

if (wejscie[i] > max)

max = i;  

}

return max;

}

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] tablica = new int[8];
        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.
                tablica[i]=mountainH;
                
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            for (int j = 0; j < 8; j++) {
            System.out.println(znajdzMax(tablica));
            tablica[znajdzMax(tablica)]=0;
            }
            // The number of the mountain to fire on.
        }
    }
}
