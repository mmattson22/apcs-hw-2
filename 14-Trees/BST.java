public class BST {
    
    private Node root;
    
    public BST() {
        root = new Node();
    }
    
    public BST(Node n) {
        root = n;
    }
    
    /*
     public Node search(Node t, Integer i) {
     while (t != null) {
	    if (t.getData() < i) {
     t = t.getRight();
	    } else if (t.getData() > i) {
     t = t.getLeft();
	    } else {
     return t;
	    }
     }
     return null;
     }
     */
    
    //RECURSIVE VERSION
    public Node search(Node t, int i) {
        if (t == null || t.getData() == i) {
            return null;
        } else if (i < t.getData()) {
            return search(t.getLeft(),i);
        } else {
            return search(t.getRight(),i);
        }
    }
    
    public String search(int i) {
        Node n = search(root,i);
        if (n == null) {
            return "NOT FOUND";
        } else {
            return n.toString();
        }
    }
    
    public void insert(int i) {
        //Insert as a new leaf
        //Create new node n
        //Search for the value of n but use a piggyback pointer
        //When lead pointer (T) gets to null, piggyback (T2) will be at the
        //node before the insertion point
        //Insert new node to the left or right of T2 as appropriate
        
        Node newLeaf = new Node(i);
        Node cur = root;
        Node piggy = null;
        if (root == null)
            root = newLeaf;
        while (cur != null){
            piggy = cur;
            if (cur.getData() == i) {
                return;
            } else if (cur.getData() < i) {
                cur = cur.getRight();
            } else if (cur.getData() > i) {
                cur = cur.getLeft();
            } else {
                return;
            }
        }
        if (i > piggy.getData()) {
            piggy.setRight(newLeaf);
        } else {
            piggy.setLeft(newLeaf);
        }
    }
    
    public String traverse(Node t) {
        if (t == null) {
            return " ";
        } else {
            return traverse(t.getLeft()) + " " +
            t.getData() + " " +
            traverse(t.getRight());
        }
    }
    
    public void remove(Node n, int i){
        if (n = root || (n.getLeft()!=null && n.getRight()!=null)){
            
            
        } else if (n.getRight()=null && n.getLeft()=null){
         
            
        } else if (n.getRight()=null || n.getLeft()=null){
    }
    }
        
        public static void main(String[] args) {
        Node n = new Node(17);
        BST b = new BST(n);
        System.out.println(b.traverse(n));
        System.out.println();
        
        b.insert(22);
        System.out.println();
        
        b.insert(15);
        System.out.println();
        
        System.out.println(b.traverse(n));
        
        b.insert(9);
        System.out.println();
        
        b.insert(27);
    }
    
}