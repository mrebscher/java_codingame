import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min = 100000;
        int[] array = new int[N]; 
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            array[i] = pi;
        }
        int k;
        for(int j=0; j<(N-1); j++){
            for(k=(j+1); k<N; k++){
                    int diff=Math.abs(array[j]-array[k]);
                    if(diff<min) min=diff;
            }
        }
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(min);
    }
}
