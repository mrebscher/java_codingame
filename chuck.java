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
        String MESSAGE = in.nextLine();

        String result = "";
        char[] messChar = MESSAGE.toCharArray();

        for (int i = 0; i < messChar.length; i++) {
            result += Integer.toBinaryString(messChar[i]) + " ";
        }
        
        
        char[] resultCharArray = result.toCharArray();
        int[] resultIntArray = new int[result.length()];

        for (int i = 0; i < result.length(); i++) {
            resultIntArray[i] = resultCharArray[i] - '0';
        }
        
        
        for(int i = 0; i < result.length(); i++){
            if(resultIntArray[i] == 1){
                System.out.print("0 0");
            }
            if(resultIntArray[i] == 0){
                System.out.print("00 0");
            }
            if(resultIntArray[i] == -16){
                System.out.print("");
            }
            int ch=1;
            for(int j=i+1; j < result.length() && ch == 1; j++){
                if(resultIntArray[i] == resultIntArray[j]){
                    System.out.print("0");
                } else{
                    if(j<result.length()-1 && resultIntArray[j] == -16){
                    System.out.print("");
                } else{
                    i = j-1;
                    ch = 0;
                }
                }
            }
            if(i >= (result.length()-2)) {
                System.out.println();
                i = result.length();
            } else System.out.print(" ");
        }
        
    
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}
