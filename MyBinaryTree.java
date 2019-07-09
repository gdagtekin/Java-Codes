package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
class MyNode {

    int data;
    MyNode leftChild, rightChild;
}

class MyTree {

    public static int value = 0, counter = 0;
    MyNode root, left, right;

    public void MyTree() {
        root = null;
        left = null;
        right = null;
    }

    public void add(int data) {
        MyNode newNode = new MyNode();
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            MyNode current = root;
            MyNode parent;
            while (true) {
                parent = current;
                if (current.data > data) {
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

    public void inOrder(MyNode node) {
        if (node != null) {
            inOrder(node.leftChild);
            System.out.print(node.data + " ");
            value += node.data;
            counter++;
            inOrder(node.rightChild);
        }
    }

    public void postOrder(MyNode node) {
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.print(node.data + " ");
        }
    }

    public void preOrder(MyNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    public void find(int value) {
        MyNode gofind = root;
        while (gofind.data != value) {
            if (gofind.data > value) {
                gofind = gofind.leftChild;
            } else {
                gofind = gofind.rightChild;
            }
            if (gofind == null) {
                System.out.println("Data is not found.");
                return;
            }
        }
        System.out.println("Data is found: " + gofind.data);
    }

    public boolean delete(int value) {
        MyNode current, parent;
        current = parent = root;
        boolean isALeftChild = true;
        while (current.data != value) {
            parent = current;
            if (current.data > value) {
                isALeftChild = true;
                current = current.leftChild;
            } else {
                isALeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null) {//Delete leaf
            if (root == current) {
                root = null;
            } else if (isALeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isALeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isALeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }

        return true;
    }

}

public class MyBinaryTree {

    public static void main(String[] args) {
        MyTree m = new MyTree();
        m.add(5);
        m.add(-5);
        m.add(-51);
        m.add(81);
        m.add(1);
        m.add(15);
        m.add(894);
        m.add(419);
        System.out.println("Inorder");
        m.inOrder(m.root);
        System.out.println("\n\nPreOrder");
        m.preOrder(m.root);
        System.out.println("\n\nPostOrder");
        m.postOrder(m.root);
        System.out.println("\n\nIs my data here?");
        m.find(1);
        System.out.println("Sum: " + m.value);
        System.out.println("Counter: " + m.counter);
        System.out.println("Average: " + m.value / m.counter);
        m.delete(-51);
        m.delete(81);
        System.out.println("\n\nAfter delete leaf inorder sort");
        System.out.println("Inorder");
        m.inOrder(m.root);
        System.out.println("");
    }
}
