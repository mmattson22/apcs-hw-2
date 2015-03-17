public class LList {
    private Node l=null;
    
    public void add(String s){
        Node tmp = new Node(s);
        tmp.setNext(l);
        l = tmp;
    }
    
    public String find(int n){
        Node temp = l;
        int position = 0;
        String ans = "";
        for (temp = l; temp != null; temp = temp.getNext()){
            position += 1;
            if ((position - 1) == n){
                ans = ans + temp;
            }
        }
        return ans;
    }
    
    public void insert(int n, String s){//This takes the idea behind find and kind of reverses it. Sort of.
        Node newb = new Node(s);
        Node old = null;
        int position = 0;
        for(old = l; (position < (n-1)) && old != null; old = old.getNext()/*<---the important part*/){
            position += 1;
        }
        newb.setNext(old.getNext());//The old switcheroo.
        old.setNext(newb);
    }//This is cool!
    
    public String toString(){
        String s = "";
        Node tmp;
        for (tmp = l; tmp != null; tmp=tmp.getNext()){
            s = s + tmp + " --> ";
        }
        s = s + "null";
        return s;
    }
    
}