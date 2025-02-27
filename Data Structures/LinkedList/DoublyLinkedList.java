public class DoublyLinkedList<T> {

    private T value;
    private DoublyLinkedList<T> prev;
    private DoublyLinkedList<T> next;
    private DoublyLinkedList<T> head;

    public DoublyLinkedList(){
        super();
    }

    public DoublyLinkedList(T t){
        this.value = t;
        this.prev = null;
        this.next = null;
        this.head = this;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoublyLinkedList<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedList<T> prev) {
        this.prev = prev;
    }

    public DoublyLinkedList<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedList<T> next) {
        this.next = next;
    }

    public DoublyLinkedList<T> getHead() {
        return head;
    }

    public void setHead(DoublyLinkedList<T> head) {
        this.head = head;
    }
    
    public void printallItems(){
        DoublyLinkedList<T> current = this.head;
        while(current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void addToBack(T t){
        DoublyLinkedList<T> newItem = new DoublyLinkedList<>(t);
        DoublyLinkedList<T> current = this.getHead();

        if(current == null){
            this.setHead(newItem);
            return;
        }
        while(current.getNext() != null){
            current = current.getNext();
        }
        newItem.setPrev(current);
        current.setNext(newItem);
    }

    public void addToFront(T t){
        DoublyLinkedList<T> newItem = new DoublyLinkedList<>(t);
        DoublyLinkedList<T> current = this.getHead();

        if(current == null){
            this.setHead(newItem);
            return;
        }

        while(current.prev != null){
            current = current.getPrev();
        }
            current.setPrev(newItem);
            newItem.setNext(current);
            current.setHead(newItem);
        
    }

    public boolean addToIndex(T t, int index){
        DoublyLinkedList<T> current = this.getHead();
        DoublyLinkedList<T> newItem = new DoublyLinkedList<>(t);

        if(current == null){
            if(index == 0){
                this.head = newItem;
                return true;
            }
            throw new IndexOutOfBoundsException("Index is greater than items in the list");
        } 
        
        if(index == 0){
            newItem.setNext(current);
            current.setPrev(newItem);
            this.setHead(newItem);
            return true;
        }

        for(int i = 0; i < index-1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("Index is greater than items in the list");
            }
            current = current.getNext();
        }
        
        newItem.setPrev(current);
        newItem.setNext(current.getNext());
        current.setNext(newItem);
        
        if(newItem.getNext() != null)
           newItem.getNext().setPrev(newItem);
        
        return true;
    }

    public void removeDuplicateFromSorted(){
        removeDuplicate(this.head);
    }

    private DoublyLinkedList<T> removeDuplicate(DoublyLinkedList<T> current){

        if(current == null)
          return null;
        
        current.setNext(removeDuplicate(current.getNext()));

        if(current.getNext() != null && current.getNext().getValue().equals(current.getValue())){
            return current.getNext();
        }

        return current;
        
    }

    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(5);
        list.addToBack(12);
        list.addToBack(44);
        list.addToBack(44);
        list.addToBack(99);
        list.addToFront(1);

        list.printallItems();

        System.out.println("\n");

        list.addToIndex(55, 5);
        list.addToIndex(55,5);
        list.addToIndex(0, 0);

        list.printallItems();

        System.out.println("\n Removed Duplicates");
        list.removeDuplicateFromSorted();
        list.printallItems();
    }
}
