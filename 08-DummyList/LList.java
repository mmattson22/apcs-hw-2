public class LList {
    
    private Node start,end;
    private int len;
    
    public LList() {
        start = new Node("");
        end = null;
        start.setNext(end);
        len = 0;
    }
    
    public void add(String s){
        Node tmp = new Node(s);
        start.setNext(tmp);
        tmp.setNext(end);
        end = tmp;
        len++;
    }
    
    public Node get(int n) {
        Node tmp = start;
        int counter = -1;
        while(counter < n && tmp != null) {
            tmp = tmp.getNext();
            counter++;
        }
        return tmp;
    }
    
    public void add(int n, String s) {
        Node added = new Node(s);
        Node before = get(n - 1);
        System.out.println(before);
        Node after = get(n);
        System.out.println(after);
        added.setNext(after);
        before.setNext(added);
    }
    
    public void remove(int n) {
        Node before = get(n - 1);
        Node after = get(n + 1);
        before.setNext(after);
        len--;
    }
    
    public int getLength() {
        return len;
    }
    
    public String toString(){
        String s = "null --> ";
        Node tmp;
        for (tmp = start.getNext(); tmp != null; tmp = tmp.getNext()){
            s = s + tmp + " --> ";
        }
        s = s + "null";
        return s;
    }
    
}