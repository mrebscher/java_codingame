import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        
        if(n==0){
            System.out.println("0");
        }
        else{
            int min=10000;
            for(int i=0; i<n; i++){
                int t=in.nextInt();
                if(Math.abs(t)<Math.abs(min) || (t==-min && t>0))
                min=t;
            }
        System.out.println(min);
        }
    }
}
