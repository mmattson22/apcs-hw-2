import java.util.*;

public class selection {
    
    private int[] L;
    private Random rn = new Random();
    
    public selection(int[] n) {
        L = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            L[i] = n[i];
        }
    }
    
    public int partition(int[] L, int k, int SI, int EI) {
        int P = L[EI];
        int low = SI;
        int high = EI;
        int highComp, lowComp;
        while (low < high) {
            if (L[low] < P) {
                low = low + 1;
            } else {
                high = high - 1;//You found an item thats bigger than the p, so put it on the other side.
                lowComp = L[low];
                highComp = L[high];
                L[low] = highComp;
                L[high] = lowComp;
                
            }
        }
        L[EI] = L[high];
        L[high] = P;
        if (high == k) {
            return L[high];//You found it!
        } else if (high < k) {
            return partition(L,k,SI+1,EI);
        } else {
            return partition(L,k,SI,EI - 1);//Change the search
        }
    }
    
    public static void main(String[] args) {
        int[] L = new int[20];
        Random rn = new Random();
        for (int i = 0; i < L.length; i++) {
            L[i] = rn.nextInt(20);
        }
        selection s = new selection(L);
        System.out.println(s.partition(L,7,0,19));
    }
}