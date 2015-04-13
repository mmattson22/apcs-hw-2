public class Node{
    
    private char symbol;
    private int x;
    private int y;
    private Node next;
    
    public Node(){
        next = null;
    }
    
    public Node(char s) {
        symbol = s;
        next = null;
    }
    
    public Node(char s, int xcor, int ycor){
        symbol = s;
        x = xcor;
        y = ycor;
        next = null;
    }
    
    public void setData(int xcor, int ycor){
        x = xcor;
        y = ycor;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public char getData() {
        return symbol;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
    public Node getNext(){
        return next;
    }
    
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
}