package Experiment7;

public class MyQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    public MyQueue(int[] arr){
        this.arr = arr;
        front = 0;
        rear = 0;
        size = 0;
    }
    public void enqueue(int element) {
        if(size != arr.length){
            if(rear == arr.length){
                rear = 0;
            }
            arr[rear] = element;
            rear++;
            size++;
        }
        else {
            System.out.println("queue overflow");
        }
    }
    public int dequeue() {
        int removedElement = 0;
        if(!isEmpty()){
            if(size != arr.length){
                if(front == arr.length){
                    front = 0;
                }
            }
            removedElement = arr[front];
            front ++;
            size--;}
        else{
            System.out.println("queue underflow");
        }
        return removedElement;
    }
    public int peek() {
        int frontElement = 0;
        if(!isEmpty()){
            frontElement = arr[front];
        }
        return frontElement;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void printQueue(){
        if(rear <= front){
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + "<--");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }
        }
        else{
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + "<--");
            }
        }
    }
}
