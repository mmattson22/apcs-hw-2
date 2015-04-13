public class myStack {
    
    public Node l;
    
    public myStack() {
        l = null;
    }
    
    public void push(Node n) {
        n.setNext(l);
        l = n;
    }
    
    public void push(char symbol, int x, int y) {
        Node n = new Node(symbol,x,y);
        n.setNext(l);
        l = n;
    }
    
    public Node pop() {
        Node tmp = l;
        l = l.getNext();
        return tmp;
    }
    
    public boolean empty() {
        return l == null;
    }
    
    public Node peek() {
        if (!empty()) {
            return l;
        }
        return null;
    }
    
    public String toString() {
        String s = "TOP";
        Node tmp;
        for (tmp = l; tmp != null; tmp = tmp.getNext()){
            s = s + " <-- " + tmp;
        }
        return s;
    }
}