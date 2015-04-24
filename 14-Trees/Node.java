public class Node {
    
    private Integer data;
    private Node left, right;
    
    public Node(){
        data = null;
        left = null;
        right = null;
    }
    
    public Node(Integer s){
        data = s;
        left = null;
        right = null;
    }
    
    public Node(Integer s, Node l, Node r) {
        data = s;
        left = l;
        right = r;
    }
    
    public void setData(Integer s){
        data = s;
    }
    
    public Integer getData(){
        return data;
    }
    
    public void setLeft(Node n){
        left = n;
    }
    
    public void setRight(Node n) {
        right = n;
    }
    
    public Node getLeft() {
        return left;
    }
    
    public Node getRight() {
        return right;
    }
    
    public String toString(){
        return ""+data;
    }
    
}