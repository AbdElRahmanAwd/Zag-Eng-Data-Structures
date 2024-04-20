import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BinaryTree {
    public static class Node {
        public int value;
        private Node leftNode;
        private Node rightNode;
        public Node (int value) {
            this.value = value ;
        }
    }

    private Node root;

    public void insert (int entry) {
        var node = new Node(entry);
        Node currentNode = root;

        if (isEmpty()) {
            root = node;
            return;
        } else {
            Node parent = getParent(entry);
            if (parent.value > entry)
                parent.leftNode = node;
            else
                parent.rightNode = node;
        }

    }

    public Node getParent (int entry) {
        Node currentNode = root;
        Node parent = root;

        while (currentNode != null){
            parent = currentNode;
            if (currentNode.value > entry)
                currentNode = currentNode.leftNode;
            else
                currentNode = currentNode.rightNode;
            }
        return parent;
    }

    public boolean find (int entry) {
        checkEmpty();
        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.value == entry)
                return true;
            else if (currentNode.value > entry)
                currentNode = currentNode.leftNode;
            else
                currentNode = currentNode.rightNode;
        }
        return false;
    }

    private void preOrder (Node root) {
        if (root == null)
            return;

        System.out.print(root.value + " ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public void preOrder () {
        preOrder(root);
        System.out.println();
    }

    private void inOrder (Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.leftNode);
        System.out.print(root.value + " ");
        inOrder(root.rightNode);
    }

    public void inOrder () {
        inOrder(root);
        System.out.println();
    }


    private void postOrder (Node root) {
        if (root == null)
            return;

        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.print(root.value + " ");
    }

    public void postOrder () {
        postOrder(root);
        System.out.println();
    }

    private void descendingOrder (Node root) {
        if (root == null)
            return;

        descendingOrder(root.rightNode);
        System.out.print(root.value + " ");
        descendingOrder(root.leftNode);
    }

    public void descendingOrder () {
        descendingOrder(root);
        System.out.println();
    }

    public int max () {
        checkEmpty();

        Node currentNode = root;
        while (currentNode.rightNode != null){
            currentNode = currentNode.rightNode;
        }
        return currentNode.value;
    }

    public int min () {
        checkEmpty();

        Node currentNode = root;
        while (currentNode.leftNode != null){
            currentNode = currentNode.leftNode;
        }
        return currentNode.value;
    }

    public boolean equals (BinaryTree tree2) {
        return equals(root , tree2.root);
    }

    private boolean equals (Node root1, Node root2) {
        if (root1 == null && root2==null)
            return true;

        if (root1 != null && root2 != null) {
            return (root1.value == root2.value) &&
                    equals(root1.rightNode, root2.rightNode) &&
                    equals(root1.leftNode, root2.leftNode);
        }
        return false;
    }

    public int height () {
        return height(root);
    }

    public boolean isLeaf (Node root) {
        return root.rightNode == null && root.leftNode == null;
    }

    private int height (Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.rightNode),height(root.leftNode));
    }

    public ArrayList<Integer> kthElementFromRoot (int distance) {
        var arrayList = new ArrayList<Integer>();
        kthElementFromRoot(root,distance,arrayList);
        return arrayList;
    }

    private void kthElementFromRoot (Node root,int distance ,ArrayList<Integer> arrayList) {
        if (root == null)
            return;

        if (distance == 0){
            arrayList.add(root.value);
            return;
        }

        kthElementFromRoot(root.leftNode , distance - 1 ,arrayList);
        kthElementFromRoot(root.rightNode , distance - 1 ,arrayList);
    }

    public void levelOrder () {
        for (int i = 0; i <= height(); i++) {
            var list = kthElementFromRoot(i);
            System.out.println("level "+i+" >> "+ list);
        }
    }

    public boolean isEmpty () {
        return root == null ;
    }

    private void checkEmpty () {
        if (isEmpty())
            throw new NoSuchElementException("tree is empty ya man");
    }
}
