package Experiment4;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            tail = node;
            node.setNext(node);
        } else {
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            addFirst(element);
        } else {
            node.setNext(tail.getNext());
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    public int removeFirst() {
        int removedElement = 0;
        if (!isEmpty()) {
            Node firstNode = tail.getNext();
            if (firstNode == tail) {
                tail = null;
            } else {
                tail.setNext(firstNode.getNext());
            }
            size--;
            removedElement = firstNode.getData();
        }
        return removedElement;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public int size() {
        return size;
    }

    public void printLinkedList() {
        if (!isEmpty()) {
            Node temp = tail.getNext();
            while (temp != tail) {
                System.out.print(temp.getData() + ", ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }
}