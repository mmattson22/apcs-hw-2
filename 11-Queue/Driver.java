public class Driver {
    public static void main(String[] args) {
        
        Queue q = new Queue();
        
        
        for(int i = 0; i < 10; i++) {
            q.enqueue("" + i);
        }
        
        System.out.println(q);
    }
}