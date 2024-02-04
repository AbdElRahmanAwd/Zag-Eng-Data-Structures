import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue<E> { // Queue by using array
    private Object[] item;
    private int size = 0;
    private int elements = 0;
    private int first = 0;
    private int last = 0;

    public Queue() {
        item = new Object[10];
        size = 10;
    }

    public Queue(int value) {
        item = new Object[value];
        size = value;
    }

    public void enQueue(E element) {
        if (isFull())
            throw new NoSuchElementException("Queue Is Full");
        
        item[last] =element;
        elements++;
        last = (last+1) % size;
    }

    public Object deQueue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue Is Full");

        Object value = item[first];
        item[first] = null;
        first = (first+1) % size;
        elements--;

        return value;
    }

    public Object peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue Is Full");

        return item[first];
    }

    public void printQueue(){
        System.out.print("[");
        if (!isEmpty()) {
            System.out.print(item[first]);
            int primary = (first+1) % size;
            while (primary != last) {
                System.out.print(","+item[primary]);
                primary = (primary+1) % size;
            }
        }
        System.out.println("]");
    }

    public void reversQueue(){
        Stack<Object> stack = new Stack<>();
        while (!isEmpty()){
            stack.push(deQueue());
        }
        while (!stack.isEmpty()){
            enQueue((E) stack.pop());
        }
    }

    public int getSize(){
        return elements;
    }

    public String toString(){
        return Arrays.toString(item);
    }

    public boolean isFull() {
        return size == elements;
    }

    public boolean isEmpty() {
        return elements == 0;
    }
}
