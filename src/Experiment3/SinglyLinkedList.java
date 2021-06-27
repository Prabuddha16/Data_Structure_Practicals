package Experiment3;

public class SinglyLinkedList {
    private Node head;
    private int size;
    public void add(int data) {
        if(head == null) {
            addFirst(data);
        }else {
            Node current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            Node newNode = new Node(data);
            current.setNext(newNode);
        }
    }
    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }
    public Node removeFirst(){
        Node deletedNode = null;
        if(!isEmpty()){deletedNode = new Node(head.getData());
            if(size == 1){
                head = null;
            }
            else{
                head = head.getNext();
            }
            size--;
        }
        return deletedNode;
    }
    public Node removeLast(){
        Node deletedNode = null;
        if(!isEmpty()){
            Node current = head;
            Node prev = null;
            while(current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }
            prev.setNext(null);
            deletedNode = current;
        }
        return deletedNode;
    }
    public void printLinkedList() {
        if(!isEmpty()) {
            Node current = head;
            while(current != null) {
                System.out.println(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        }else {
            System.out.println("Linked List is empty");
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int getSize() {
        return size;
    }
}

