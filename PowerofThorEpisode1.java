import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int x=lightX-initialTX;
        int y=lightY-initialTY;
        
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            // A single line providing the move to be made: N NE E SE S SW W or NW
            if(x<0 && y<0) {
                System.out.println("NW");
                x++;
                y++;
                }
            if(x<0 && y>0){
                System.out.println("SW");
                x++;
                y--;
                }
            if(x>0 && y<0){
                System.out.println("NE");
                x--;
                y++;
                }
            if(x>0 && y>0){
                System.out.println("SE");
                x--;
                y--;
                }
            if(x<0 && y==0){
                System.out.println("W");
                x++;
                }
            if(x>0 && y==0){
                System.out.println("E");
                x--;
                }
            if(y<0 && x==0){
                System.out.println("N");
                y++;
                }
            if(y>0 && x==0){
                System.out.println("S");
                y--;
                }           
        }
    }
}
