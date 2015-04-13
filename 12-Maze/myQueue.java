public class myQueue {
    
    public Node start;
    public Node end;
    
    public myQueue(){
        start = null;
        end = null;
    }
    
    public boolean empty(){
        return start == null;
    }
    
    public void enqueue(Node n){
        if (start == null) {
            start = n;
            end = start;
        } else {
            Node tmp = n;
            end.setNext(tmp);
            end = tmp;
        }
    }
    
    public void enqueue(char symbol, int x, int y) {
        Node n = new Node(symbol,x,y);
        if (start == null) {
            start = n;
            end = start;
        } else {
            end.setNext(n);
            end = n;
        }
    }
    
    public Node dequeue (){
        Node tmp = start;
        start = start.getNext();
        return tmp;
    }
    
    public Node head(){
        return start;
    }
    
    public String toString() {
        String s = "HEAD <-- ";
        Node tmp = end.getNext();
        while (tmp != null) {
            s += "[" +  tmp.getX() + ", " + tmp.getY() + "]" +  " <-- ";
            tmp = tmp.getNext();
        }
        return s + "TAIL";
    }
}