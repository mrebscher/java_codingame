import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String[] EXT = new String[N];
        String[] MT = new String[N];
        for (int i = 0; i < N; i++) {
            EXT[i] = in.next();// file extension
            EXT[i] = EXT[i].toLowerCase();
            MT[i] = in.next(); // MIME type.
            in.nextLine();
        }
        String output = "";
        int spr1=1;
        int j;
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine();
            FNAME=FNAME.toLowerCase();// One file name per line.
            int length = FNAME.length();
            char[] fname = FNAME.toCharArray();
            for(j=(length-1); j>=0; j--){
                if(fname[j] == '.'){
                    for(int k=1; k<(length-j); k++){
                    output = output + String.valueOf(fname[j+k]);
                    }
                    j=-2;
                    int k;
                    for(k=0; k<N && spr1==1; k++){
                        if(output.equals(EXT[k])){
                           System.out.println(MT[k]);
                           k=N+1;
                        }
                    }
                    if(k == N) System.out.println("UNKNOWN");
                    output = "";
                }
            }
            if(j==-1){
                System.out.println("UNKNOWN");
            }         
        }
    }
}  
