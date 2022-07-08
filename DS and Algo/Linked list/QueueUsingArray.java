public class QueueUsingArray {

    public static void main(String args[]){

        ArrQueue q = new ArrQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(45);
        q.showstack();
        System.out.println();
        q.dequeue();
        q.showstack();

    }
    
}

class ArrQueue{

    private int n;
    private int first = 0;
    private int last = 0;
    private int[] arr;

    ArrQueue(int size){
        this.n = size;
        arr = new int[n];
    }

    public void enqueue(int value){
        if(first == last){
            arr[first] = value;
            last = last+1;
        }
        else{
            if( last < n){
            arr[last] = value;
            last += 1;
            }
            else System.out.println("Queue size exceeded");
        }
    }

    public void dequeue(){
        if(first == last){
            arr[first] = 0;
        }
        else{
            arr[first] = 0;
            first += 1;
        }
    }

    public void showstack(){
        for(int i =0; i<last; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public int gettop(){
        return this.first;
    }
}
