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
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String[] ROW = new String[H];
      
        for (int i = 0; i < H; i++) {
            String ROW[1] = in.nextLine();
        }
        
     

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(ROW.substring(1, 4));
    }
}
