import java.util.NoSuchElementException;

public class SinglyLinkedList {
    public static void main(String args[]){

        LinkedList list = new LinkedList();
        list.additem(10);
        list.additem(20);
        list.additem(30);
        list.addFirst(5);

        list.printlist();
        System.out.println(list.indexOf(30));
        System.out.println(list.contains(40));
        list.deleteFirst();
        list.deletelast();
        list.additem(25);
        list.printlist();
    }
}

class LinkedList{

    protected class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    
    public void additem(int value){
        var node = new Node(value);

        if(isEmpty())
             head = tail = node;
        else{
             tail.next = node;
             tail = node;
        }
    }

    public void printlist(){
        var traverse = head;
        while(traverse != null){
            System.out.println(traverse.value);
            traverse = traverse.next;
            }
        }

    public void addFirst(int value){

        Node node = new Node(value);
        if(isEmpty())
            head = tail = node;
        else{
        node.next = head;
        head = node;
        }
    }

    public int indexOf(int value){
        var current = head;
        int index = 0;
        while(current != null){
            if(current.value == value) return index;
            else {
                current = current.next;
                index += 1;
            }
        }
        return -1;
    }

    public void deleteFirst(){

        if(isEmpty()) throw new NoSuchElementException();

        else if( head == tail) head = tail = null;

        else{
            var second = head.next;
            head.next = null;
            head = second;
        }
    }

    public void deletelast(){
        if(isEmpty()) throw new NoSuchElementException();

        else if (head == tail) head = tail = null;

        else{
            var current = head;
            while(current.next != null){
                if(current.next.next == null){
                    current.next = null;
                    tail = null;
                    tail = current;
                }
                else
                current = current.next;
            }
        }
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    private boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

}