public class LList {
    //Sorry this is late, I was absent Wednesday
    private Node start,end;
    
    private int len;
    
    public LList() {
        start = new Node(0);
        end = null;
        start.setNext(end);
        len = 0;
    }
    
    public void add(int s){
        Node tmp = new Node(s);
        start.setNext(tmp);
        tmp.setNext(end);
        end = tmp;
        len++;
    }
    
    
    public void add(int n, int s) {
        Node added = new Node(s);
        Node before = start;
        for (int i = 0; i < n; i++) {
            before = before.getNext();
        }
        added.setNext(before.getNext());
        before.setNext(added);
        len++;
    }
    
    public int get(int n) {
        if (n >= len || n < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Node tmp = start;
            int counter = -1;
            while(counter < n && counter < len) {
                tmp = tmp.getNext();
                counter++;
            }
            return tmp.getData();
        }
    }
    
    public boolean remove(int n) {
        Node tmp = start;
        for (int i = 0; i < len; i++) {
            if(tmp.getNext().getData() == n) {
                tmp.setNext(tmp.getNext().getNext());
                len--;
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }
    
    
    public int size() {
        return len;
    }
    
    public String toString(){
        String s = "empty --> ";
        Node tmp;
        for (tmp = start.getNext(); tmp != null; tmp = tmp.getNext()){
            s = s + tmp + " --> ";
        }
        s = s + "null";
        return s;
    }
    
    public get LLit(){
        LLit llit = new LLit();
        return llit;
    }
    
}