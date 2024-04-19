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

    public boolean isEmpty () {
        return root == null ;
    }

    private void checkEmpty () {
        if (isEmpty())
            throw new NoSuchElementException("tree is empty ya man");
    }
}
