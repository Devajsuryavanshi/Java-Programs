public class QueueUsingLL {
    
    public static void main(String args[]){

        Queue q = new Queue();

        q.enque(10);
        q.enque(15);
        q.enque(30);
        q.enque(45);

        q.printqueue();
        System.out.println();

        q.deque();
        q.deque();

        q.printqueue();

    }
}

class Queue{

    protected class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node first; private Node last;

    public void enque(int value){
        Node node = new Node(value);

        if(first == null) first = last = node;

        else{
            last.next = node;
            last = node;
        }
    }

    public void deque(){

        if(first == null) System.out.println("Empty queue");

        else if( first == last) first = last = null;

        else{
            var nex = first.next;
            first = null;
            first = nex;
        }
    }

    public int getpeak(){
        return first.value;
    }

    public void printqueue(){
        queuereturn(first);
    }

    private void queuereturn(Node n){

        if(n == null){
            return;
        }
        queuereturn(n.next);
        System.out.print(n.value + " ");
    }
}
