import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>{

    private T value;
    private SinglyLinkedList<T> head = null;
    private SinglyLinkedList<T> next = null;

    public SinglyLinkedList(T value){
        this.value = value;
        this.head = this;
    }

    public SinglyLinkedList(){
        super();
    }

    public void add(T t){
        if(this.head == null){
            this.head = new SinglyLinkedList<>(t);
            return;
        }

        SinglyLinkedList<T> current = this.head;
        while(current.next != null)
            current = current.next;

        current.next = new SinglyLinkedList<>(t);
    }

    public void addToIndex(T t, int index) throws IndexOutOfBoundsException{
        SinglyLinkedList<T> newNode = new SinglyLinkedList<>(t);
        SinglyLinkedList<T> current = this.head;
        if(index == 0){
            newNode.next = this.head;
            this.head = newNode;
        } else {
            for(int i = 0; i < index-1; i++){
                if(current == null){
                    throw new IndexOutOfBoundsException("Reached the end of LinkedList before target Index");
                }
                current = current.next;
            }
            if(current.next == null) {
                current.next = newNode;
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void printallItems(){
        for(T val: this.head){
            System.out.println(val);
        }
    }

    public boolean replaceItem(T t, T newValue){
        SinglyLinkedList<T> current = this.head;
        while(current != null){
            if((current.value).equals(t)) {
               current.value = newValue;
               return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean deleteItem(T t){
        if(this.head == null) {
            return false; // List is empty
        }
        
        SinglyLinkedList<T> current = this.head;
        SinglyLinkedList<T> previous = null;
    
        while(current != null){
            if(current.value.equals(t)){
                if(previous == null){ // Head node to be deleted
                    if(current.next == null){ // Single-element list
                        this.head = null; // Set the head to null
                    } else {
                        this.head = current.next; // Update head to the next node
                    }
                } else {
                    if(current.next == null){ // Tail node
                        previous.next = null; // Set the previous node's next to null
                    } else {
                        previous.next = current.next; // Skip the current node
                    }
                }
                return true;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new SinglyLinkedListIterator<>(this);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SinglyLinkedList<T> getHead() {
        return head;
    }

    public void setHead(SinglyLinkedList<T> head) {
        this.head = head;
    }

    public SinglyLinkedList<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedList<T> next) {
        this.next = next;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(12);
        list.add(44);
        list.add(21);
        list.add(91);

        list.printallItems();

        list.replaceItem(12,55);
        list.deleteItem(1);
        list.addToIndex(81, 0);
        list.addToIndex(90,4);
        list.printallItems();
    }
}
