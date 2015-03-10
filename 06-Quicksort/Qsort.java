import java.util.*;
import java.io.*;
public class Qsort{
    private int[] a,b;
    Random rnd = new Random();
    public Qsort(){
        this(20);
    }
    public Qsort(int n){
        Random r = new Random();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
    }
    
    public String toString(){
        return Arrays.toString(a);
    }
    
    public int partition(int[] a, int l, int r) {
        int tmp;
        int pivotIndex=l;
        int pivot = a[pivotIndex];
        tmp = a[r];
        a[r] = a[pivotIndex];
        a[pivotIndex]=tmp;
        
        int wall=l;
        int pcount=1;
        for (int i=l;i<r;i++) {
            if (a[i]<pivot) {
                tmp = a[i];
                a[i]=a[wall];
                a[wall]=tmp;
                wall++;
            }
            if (a[i]==pivot)
                pcount++;
        }
        // now copy over all the pivots
        int rwall=wall;
        tmp = a[rwall];
        a[wall]=a[r];
        a[r]=tmp;
        rwall++;
        for (int i=rwall+1;i<=r;i++) {
            if (a[i]==pivot) {
                tmp = a[rwall];
                a[rwall]=a[i];
                a[i]=tmp;
                rwall++;
            }
        }
        return (wall+rwall)/2;
    }
    
    
    
    public void qsort(int[] a, int l, int h){
        int pi,pval;
        pi = partition(a,l,h);
        pval = a[pi];
        if (pi - l > 1)
            qsort(a,l,pi-1);
        if (h - pi > 1)
            qsort(a,pi+1,h);
    }
    
    
    public static void main(String[] args) {
        Qsort x = new Qsort();
        System.out.println(x);
        x.qsort(x.a,0,x.a.length-1);
        System.out.println(x);
        
    }
}