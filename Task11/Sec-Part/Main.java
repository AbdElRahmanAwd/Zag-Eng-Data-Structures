
public class Main {
    public static void main(String[] args) {

        var tree = new BinaryTree();

        tree.insert(25);
        tree.insert(30);
        tree.insert(27);
        tree.insert(20);
        tree.insert(35);
        tree.insert(40);
        tree.insert(41);
        tree.insert(28);
        tree.insert(26);
        tree.insert(28);
        tree.insert(15);
        tree.insert(22);
        tree.insert(21);
        tree.insert(16);
        tree.insert(10);
        tree.insert(25);

        System.out.println("Is 40 exist? "+ tree.find(40));
        System.out.println("Is 45 exist? "+ tree.find(45));

        System.out.print("preOrder : ");tree.preOrder();
        System.out.print("InOrder : ");tree.inOrder();
        System.out.print("PostOrder : ");tree.postOrder();
        System.out.print("DescendingOrder : ");tree.descendingOrder();

        System.out.println("The max value is >> " + tree.max());
        System.out.println("The min value is >> " + tree.min());

    }
}