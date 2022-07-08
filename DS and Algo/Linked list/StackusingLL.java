public class StackusingLL {
    public static void main(String args[]){

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(40);
        s.push(80);

        System.out.println(s.getTop());
        s.pop();
        s.printStack();


    }
}


class Stack{

    protected class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    private Node top;
    private Node last;

    private boolean isEmpty(){
        return top == null;
    }

    public void push(int value){

        Node node = new Node(value);

        if(isEmpty()){
            last = top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }

    public void pop(){
        if(isEmpty()) System.out.println("Stack Underflow");

        else if( top == last) top = last = null;

        else{
            var node = top;
            top = null;
            top = node.next;
        }
    }

    public void printStack(){
        var current = top;
        while( current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int getTop(){
        return top.value;
    }

}