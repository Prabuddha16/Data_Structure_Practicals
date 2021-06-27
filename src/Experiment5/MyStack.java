package Experiment5;

public class MyStack {
    private final int MAX_CAPACITY;
    private int[] arr;
    int top;
    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top = 0;
    }
    public void push(int element) {
        if(top != MAX_CAPACITY){
            arr[top] = element;
            top++;
        }
        else{
            System.out.println("Stack OverFlow");
        }
    }
    public int pop() {
        int topElement = 0;
        if(!isEmpty()){
            top--;
            topElement = arr[top];
        }else{
            System.out.println("Stack UnderFlow");
        }
        return topElement;
    }
    public int peek() {
        int topElement = 0;
        if(!isEmpty()){
            topElement = arr[top - 1];
        }
        else{
            System.out.println("Stack is Empty");
        }
        return topElement;
    }
    public boolean isEmpty() {return top == 0;
    }
    public int size() {
        return top;
    }
    public void printStack(){
        for (int i = 0; i < top ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
