
import java.util.Iterator;

public class SinglyLinkedListIterator<T> implements Iterator<T> {

    private SinglyLinkedList<T> current;

    public SinglyLinkedListIterator(SinglyLinkedList<T> head){
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }
    
}
