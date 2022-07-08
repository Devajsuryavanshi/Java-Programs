import java.util.NoSuchElementException;

public class DoublyLL {
    
    public static void main(String args[]){

        DlinkedList list  = new DlinkedList();

        list.addLast(5);
        list.addLast(7);
        list.addLast(9);
        list.addFirst(3);
        list.printlist();
        System.out.println();
        list.deleteLast();
        list.addLast(11);
        list.deleteFirst();
        list.addFirst(1);
        list.printlist();
        System.out.println(list.returnIndex(11));

    }
}

class DlinkedList{
    
    private Node head;
    private Node tail;

    protected class Node{
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void addLast(int value){
        var node = new Node(value);
        
        if(isEmpty()){
            head = tail = node;
            head.prev = null;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void addFirst(int value){
        var node = new Node(value);

        if(isEmpty()){
            head = tail = node;
        }
        else{
            head.prev = node;
            node.next = head;
            head  = node;
        }
    }

    public void deleteLast(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(head == tail){
            head = tail = null;
        }
        else{
            Node newnode = new Node(tail.value);
            newnode.prev = tail.prev;
            tail.prev = null;
            tail = newnode.prev;
        }
    }

    public void deleteFirst(){
        
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(head == tail){
            head = tail = null;
        }
        else{
            var newnode = head.next;
            head.next= null;
            head = newnode.next;
            head.prev = null;
            newnode = null;
        }
    }

    public void printlist(){

        var newnode = head;
        while( newnode != null ){

            System.out.print(newnode.value + " ");
            newnode = newnode.next;

        }
    }

    public int returnIndex(int value){
        
        var newnode = head;
        int i = 0;
        while( newnode != null ){
            if(newnode.value == value) return i;

            else{
                i++;
                newnode = newnode.next;
            }

        }
        return -1;
    }

    public boolean ispresent(int value){
        if(returnIndex(value) != -1){
            return true;
        }
        else return false;
    }

    private boolean isEmpty(){
        return head == null;
    }
}
