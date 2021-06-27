package Experiment8;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size;
    public MyQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    public void enqueue(int data) {
        Node node = new Node(data);
        if(!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }size++;
    }
    public int dequeue() {
        int removedElement = 0;
        if(!isEmpty()){
            removedElement = front.getData();
            front = front.getNext();
            if(front == null){
                rear = null;
            }
            size--;
        }
        return removedElement;
    }
    public int peek() {
        int frontElement = 0;
        if(!isEmpty()){
            frontElement = front.getData();
        }
        return frontElement;
    }
    public boolean isEmpty() {
        return front == null;//size == o or rear == null
    }
    public int size() {
        return size;
    }
    public void printQueue(){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
    }
}
