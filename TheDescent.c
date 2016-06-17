#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    int max=0;
    int imax=0;
    // game loop
    while (1) {
        for (int i = 0; i < 8; i++) {
            int mountainH; // represents the height of one mountain, from 9 to 0.
            scanf("%d", &mountainH);
            if(mountainH > max){
                max = mountainH;
                imax = i;
            }
        printf("%d\n", imax);
        }

        // Write an action using printf(). DON'T FORGET THE TRAILING \n
        // To debug: fprintf(stderr, "Debug messages...\n");

         // The number of the mountain to fire on.
    }

    return 0;
}
