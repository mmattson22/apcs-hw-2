import java.io.*;
import java.util.*;

public class mergesort {
    

    
    
    public ArrayList<Integer> merge(ArrayList<Integer> pile1, ArrayList<Integer> pile2) {
        ArrayList<Integer> combined = new ArrayList<Integer>();
        while(pile1.size() > 0 && pile2.size() > 0) {
            if(pile1.get(0) < pile2.get(0)) {
                combined.add(pile1.get(0));
                pile1.remove(0);
            } else {
                combined.add(pile2.get(0));
                pile2.remove(0);
            }
        }
        if(pile1.size() > 0) {
            while(pile1.size() > 0) {
                combined.add(pile1.get(0));
                pile1.remove(0);
            }
        } else if (pile2.size() > 0) {
            while(pile2.size() > 0) {
                combined.add(pile2.get(0));
                pile2.remove(0);
            }
        }
        return combined;
    }

    
    public ArrayList<Integer> mergeSort(ArrayList<Integer> n) {
        if(n.size() <= 1) {
            return n;
        }
        ArrayList<Integer> pile1 = new ArrayList<Integer>();
        ArrayList<Integer> pile2 = new ArrayList<Integer>();
        int middle = n.size()/2;
        for(int i = 0; i < n.size(); i++) {
            if(i < middle) {
                pile1.add(n.get(i));
            } else {
                pile2.add(n.get(i));
            }
        }
        return merge(mergeSort(pile1), mergeSort(pile2));
    }
    
    
    public static void main(String[] args) {
        mergesort m = new mergesort();
        /Users/mhmattson/.Trash/04-MergeSort/mergesort.java
        ArrayList<Integer> A = new ArrayList<Integer>();
        Random rn = new Random();
        for (int i = 0; i < 25; i++) {
            A.add(rn.nextInt(15));
        }
        System.out.println(A);
        System.out.println(m.mergeSort(A));
        }
    
}