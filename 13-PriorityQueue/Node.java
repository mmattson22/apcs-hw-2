public class Node {
    private int x,y;
    private Node prev;
    private int priority;
    private int spaces;
    
    public Node(int x, int y){
        this.x = x;
        this.y = y;
        priority = 0;
        spaces = 0;
    }
    
    public Node(int x, int y, int spaces){
        this(x,y);
        this.spaces = spaces;
    }
    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(Node n){
        prev = n;
    }
    
    public int getspaces(){
        return spaces;
    }
    
    public void setspaces(int n){
        spaces = n;
    }
    
    public int getPriority() {
        return priority;
    }
    

    public void setPriority(int a, int b){
        priority = (a-x)*(a-x) + (b-y)*(b-y) ;
    }
    
    public void setManhattan(int a, int b){
        priority = (a-x) + (b-y);
    }
    
    public void AStarSearch(int a, int b){
        setPriority(a,b);
        priority += spaces;
        
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String toString(){
        return ""+priority;
    }
    
}
