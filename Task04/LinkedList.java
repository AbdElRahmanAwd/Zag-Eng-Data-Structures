import java.util.NoSuchElementException;

public class LinkedList {
    class Node {
        public Node(int value) {
            this.value = value;
        }
        int value;
        Node nextNode;
    }

    Node first;
    Node last;
    int size=0;

    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first=last=node;
        else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        Node node = new Node(item);
        if (isEmpty())
            first=last=node;
        else {
            last.nextNode = first;
            last = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("empty list");
        if (first == last)
            first=last=null;
        else {
            Node temp = first;
            first=first.nextNode;
            temp.nextNode = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("empty list");
        if (first == last)
            first=last=null;
        else {
            Node beforeLast = getBeforeLast();
            last = beforeLast;
            last.nextNode = null;
        }
        size--;
    }

    private Node getBeforeLast() {
        Node beforeLast = first;
        Node current = first;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public int size() {
        return size;
    }

    public int indexOf(int item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == item)
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(int value) {
        int index = indexOf(value);
        return index != -1;
    }
}