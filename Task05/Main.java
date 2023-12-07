
public class Main {
    public static void main(String[] args) {
        LinkedListT<Integer> arr1 = new LinkedListT<>();
        arr1.addFirst(4);
        arr1.addFirst(9);
        arr1.addFirst(11);
        arr1.addFirst(16);

        arr1.printItems();
        arr1.reverseItems();
        arr1.printItems();
        arr1.removeFirst();
        arr1.removeLast();
        arr1.printItems();
        System.out.println(arr1.contain(9));
        System.out.println(arr1.indexOf(9));

    }
}