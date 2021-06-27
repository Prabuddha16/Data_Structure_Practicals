package Experiment6;

public class MyStack {
    private Node top;
    private int size;
    public MyStack() {
        top = null;
        size = 0;
    }
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size++;
    }
    public int pop() {
        int removedElement = 0;
        if (!isEmpty()) {
            removedElement = top.getData();
            top = top.getNext();
            size--;
        } else {
            System.out.println("Stack UnderFlow");
        }
        return removedElement;
    }
    public int peek() {
        int topElement = 0;
        if (!isEmpty()) {
            topElement = top.getData();
        } else {
            System.out.println("Stack is empty");
        }
        return topElement;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int size() {
        return size;
    }
    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.getData() + " ");temp = temp.getNext();
        }
        System.out.println();
    }
}
