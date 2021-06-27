package Experiment9;

public class MyBinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;
    public Node<E> getRoot() {
        return root;
    }
    public void insert(E data) {
        Node<E> node = new Node<>(data);if(isEmpty()) {
            root = node;
        }else {
            Node<E> temp = root;
            Node<E> parent = null;
            while(temp != null) {
                parent = temp;
                if(data.compareTo(temp.getData()) <= 0) {
                    temp = temp.getLeft();
                }else {
                    temp = temp.getRight();
                }
            }
            if(data.compareTo(parent.getData()) <= 0) {
                parent.setLeft(node);
            }else {
                parent.setRight(node);
            }
        }
    }
    public void preOrder(Node<E> node) {
        if(node == null) {
            return;
        }else {
            System.out.print(node.getData() + ",");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        System.out.println();
    }
    public void inOrder(Node<E> node) {
        if(node == null) {
            return;
        }else {
            inOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            inOrder(node.getRight());
        }
        System.out.println();
    }
    public void postOrder(Node<E> node) {
        if(node == null) {
            return;
        }else {
            postOrder(node.getLeft());
            postOrder(node.getRight());System.out.print(node.getData() + ",");
        }
        System.out.println();
    }
    public boolean search(E searchElement) {
        boolean response = false;
        Node<E> temp = root;
        while(temp != null) {
            if(searchElement.compareTo(temp.getData()) == 0) {
                response = true;
                break;
            }else if(searchElement.compareTo(temp.getData()) < 0) {
                temp = temp.getLeft();
            }else {
                temp = temp.getRight();
            }
        }
        return response;
    }
    public boolean recursiveSearch(E searchElement) {
        Node<E> temp = root;
        return recursiveSearchHelper(root,searchElement);
    }
    private boolean recursiveSearchHelper(Node<E> root, E searchElement) {
        if(root == null) {
            return false;
        }else if(searchElement.compareTo(root.getData()) == 0) {
            return true;
        }
        if(searchElement.compareTo(root.getData()) < 0) {
            return recursiveSearchHelper(root.getLeft(),searchElement);
        }else {
            return recursiveSearchHelper(root.getRight(),searchElement);
        }
    }
    private boolean isEmpty() {
        if(root == null) {
            return true;
        }
        return false;
    }
}
