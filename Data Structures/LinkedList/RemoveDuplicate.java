
//Program to remove duplicate from Sorted Linked List
public class RemoveDuplicate {

    public static SinglyLinkedList<Integer> removeDuplicateElements(SinglyLinkedList<Integer> current){
        if(current == null){
            return null;
        }
        
        current.setNext(removeDuplicateElements(current.getNext()));

        if(current.getNext() != null && current.getValue().equals(current.getNext().getValue())) {
            return current.getNext();
        }
        return current;
    }

    public static void main(String[] args){

        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>(1);
        nums.add(2);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(5);

        removeDuplicateElements(nums);

        nums.printallItems();
    }
    
}
