import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueByStack<E> {
    Stack<Object> stack1 = new Stack<>();
    Stack<Object> stack2 = new Stack<>();
    private int count = 0;

    public void enQueue(E item){
        stack1.push(item);
        count++;
    }

    public Object deQueue(){
        if (isEmpty()) {
            throw new NoSuchElementException("kkkkk");
        }

        if (stack2.isEmpty()) {
            move();
        }
        count--;
        return stack2.pop();
    }

    private void move(){
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    public Object peek(){
        if (isEmpty())
            throw new NoSuchElementException("");

        if (stack2.isEmpty())
            move();

        return stack2.peek();
    }

//    public void printQueue(){
//        if (isEmpty())
//            throw new NoSuchElementException("empty");
//
//        System.out.print("[");
//        System.out.print(deQueue());
//        while (!isEmpty())
//            System.out.print(","+deQueue());
//        System.out.println("]");
//    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }


}
