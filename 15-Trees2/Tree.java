public class Tree {
    
    private Node root;
    
    public Tree() {
        root = new Node();
    }
    
    public Tree(Node n) {
        root = n;
    }
    
    public Node search(Node T, Integer i) {
        while (T != null) {
            int c = T.getData().compareTo(i);
            if (c > 0) {
                T = T.getRight();
            } else if (c < 0) {
                T = T.getLeft();
            } else {
                return T;
            }
        }
        return null;
    }
    
    public Node searchRecursive
    
    public void insert(Node t, int i){
        Node newLeaf = new Node(i);
        if (t == null)
            t = newLeaf;
        Node cur = t;
        Node piggy = null;
        while (cur != null){
            piggy = cur;
            int c = n.getData().compareTo(i);
            if (c < 0){
                cur = cur.getLeft();
            } else if (c > 0){
                cur = cur.getRight();
            }
        }
        if (i > piggy.getData())
            piggy.setRight(newLeaf);
        else if (i < piggy.getData()) 
            piggy.setLeft(newLeaf);
    }
    
}