
public class Main {
    public static void main(String[] args) {

        var tree1 = new BinaryTree();
        var tree2 = new BinaryTree();

        tree1.insert(25);
        tree1.insert(30);
        tree1.insert(27);
        tree1.insert(20);
        tree1.insert(35);
        tree1.insert(40);
        tree1.insert(41);
        tree1.insert(28);
        tree1.insert(26);
        tree1.insert(28);
        tree1.insert(15);
        tree1.insert(22);
        tree1.insert(21);
        tree1.insert(16);
        tree1.insert(10);
        tree1.insert(25);

        tree2.insert(25);
        tree2.insert(30);
        tree2.insert(27);
        tree2.insert(20);
        tree2.insert(35);
        tree2.insert(40);
        tree2.insert(41);
        tree2.insert(28);
        tree2.insert(26);
        tree2.insert(28);
        tree2.insert(15);
        tree2.insert(22);
        tree2.insert(21);
        tree2.insert(16);
        tree2.insert(10);
        tree2.insert(25);

        System.out.println("is tree1 = tree2 >> " + tree1.equals(tree2));
        System.out.println("the tree height >> " + tree1.height());
        tree2.levelOrder();
        System.out.println("level 2 >> " + tree2.kthElementFromRoot(2));

    }
}