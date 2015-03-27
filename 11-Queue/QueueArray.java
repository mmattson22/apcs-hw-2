public class QueueArray {
    private int[] array;
    private int last; //Index of last added item
    
    public QueueArray() {
        array = new int[100];
        last = -1;
    }
    
    public void newArray(int type) {
        if(type == 0) {
            int[] tmp = new int[array.length + 100];
            tmp = Arrays.copyOfRange(array, 0, array.length);
        } else {
            int[] tmp = Arrays.copyOfRange(array, 0, array.length);
        }
        array = tmp;
    }
    
    public void enqueue(int data) {
        try {
            array[last+1] = data;
            last++;
        }
        catch (Exception e) {
            newArray();
            enqueue(data);
        }
    }
    
    public int dequeue() {
        int answer = array[0];
        array[0] = null;
        newArray();
        return answer;
    }
}