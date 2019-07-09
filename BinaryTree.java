package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
class Node {

    int value;
    Node rightChild, leftChild;
}

class Tree {

    Node root, left, right;

    public Tree() {
        root = null;
        left = null;
        right = null;
    }

    public void addNode(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (value < current.value) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }

    }

    public void show() {
        Node first, left, right;
        first = root;

        while (true) {
            System.out.println(first.value);
            left = first.leftChild;
            System.out.print(left.value + " ");
            right = first.rightChild;
            System.out.print(right.value + " ");
            first = left;
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.value + " ");
            inOrder(root.rightChild);
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.value + " ");
        }
    }

    public boolean searchValue(int search) {
        Node first = root;
        while (first.value != search) {
            if (search < first.value) {
                first = first.leftChild;
            } else {
                first = first.rightChild;
            }
            if (first == null) {
                return false;
            }
        }
        return true;
    }

}

public class BinaryTree {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.addNode(5);
        myTree.addNode(11);
        myTree.addNode(3);
        myTree.addNode(7);
        myTree.addNode(4);
        myTree.addNode(2);
        myTree.addNode(15);
        System.out.println("İnorder");
        myTree.inOrder(myTree.root);
        System.out.println("\nPreorder");
        myTree.preOrder(myTree.root);
        System.out.println("\nPostorder");
        myTree.postOrder(myTree.root);
        System.out.println("\n");
        System.out.println(myTree.searchValue(8));
    }
}
