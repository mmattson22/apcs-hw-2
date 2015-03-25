import java.util.*;
import java.io.*;

public class ArrayStack{
    private int[] stack;
    private int last;
    public ArrayStack(){
        stack = new int[100];
        last = 0;
    }
    
    public String toString() {
        String s = "";
        for(int i = 0; i < last; i++){
            s += stack[i] + ", ";

        }
        return s + "last";
    }

    
    public void push(int data){
        if (last<stack.length){
            stack[last] = data;
        } else {
            int[] temp = new int[(last + 100)];
            for (int i = 0; i<last; i++){
                temp[i] = stack[i];
                
            }
            stack = temp;
            push(data);
        }
    }
    
    public int pop(){
        if (last>0){
            return stack[(last-1)];
            last = last - 1;
            
        } /*else {
            //throw new IndexOutOfBoundsExpection();
        }*/
    }
    
    public boolean empty(){
        return (last == 0);
    }
    
    public int top(){
        if (last>0){
            return stack[(last-1)];
            
        } /*else {
            //throw new IndexOutOfBoundsExpection();
        }*/
    }
}