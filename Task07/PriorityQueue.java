import java.util.NoSuchElementException;

public class PriorityQueue {
    private int[] arr ;
    private int count = 0;
    public PriorityQueue(int size){
        arr = new int[size];
    }

    public void add(int value){
        if (isFull())
            throw new NoSuchElementException("Queue is full");

        int i = priorityIndex(value);
        arr[i] = value;
        count++;
    }

    public int priorityIndex(int value){
        int i = count-1;
        for (; i >= 0 ; i--) {
            if (arr[i]>value)
                arr[i+1] = arr[i];
            else
                break;
        }
        return i+1;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    private boolean isFull(){
        return count == arr.length;
    }
}
