import java.util.*;
import java.io.*;

public class selection {
    
    public String partition (int[] L, int SI, int EI) {
        int[] D = new int[L.length];
        int p = L[SI];
        for (int x = 0; x < L.length;x++){
            if (x < SI && x > EI){
                D[x] = L[x];
            }
        }
        SI++;
        while (SI<EI){
            if (L[SI]<p){
                D[SI]=L[SI];
                
            }
            else{
                D[EI]=L[SI];
                EI--;
                
            }
            SI++;
        }
        D[SI]=p;
        return D.toString();
    }


    public static void main(String[] args){
        selection x = new selection();
        int[] L = {15,4,6,8,3,7,9,24,28,2};
        System.out.println(x.partition(L, 0, 9));
    }
}//I think that this should all work out, but when I run it I get [I@7a14b43d, so clearly something's wrong.