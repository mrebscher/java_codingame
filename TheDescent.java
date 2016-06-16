import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {
    public static int findMax(int[] eArray) {
        int max = 0; int imax=0; 
        for (int i = 0; i < eArray.length; i++) {
            if (eArray[i] > max){
            max = eArray[i];
            imax = i;
            }
        }
        return imax;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[8];    
        // game loop
        while (true) {      

            for (int j = 0; j < 8; j++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.
                array[j]=mountainH;
                }
              
            System.out.println(findMax(array)); // The number of the mountain to fire on.
        }
    }
}
