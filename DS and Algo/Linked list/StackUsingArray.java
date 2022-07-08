public class StackUsingArray {

    public static void main(String args[]){

        ArrStack a = new ArrStack();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.printstack();
        a.pop();
        System.out.println();
        a.printstack();

    }
}

class ArrStack{
    private int[] arr = new int[1];
    private int top = arr[arr.length-1];
    private int bottom = arr[0];

    public void push(int value){
        if(arr.length == 1){
            int[] arr1 = new int[arr.length+1];
            arr1[0] = value;
            arr = arr1.clone();
            top = bottom = arr[0];
            arr1 = null;
        }

        else{
            int[] arr1 = new int[arr.length+1];
            for(int i =0; i<arr.length; i++){
                arr1[i] = arr[i]; 
            }
            arr1[arr.length-1] = value;
            arr = arr1.clone();
            arr1 = null;
            top = arr[arr.length-2]; 
        }
    }

    public void pop(){
        int[] arr1 = new int[arr.length-1];
        for(int i = 0; i< arr.length-1; i++){
            arr1[i] = arr[i];
        }
        arr = arr1.clone();
        arr1 = null;
        top = arr[arr.length - 2];
    }

    public int getpeak(){
        return this.top;
    }

    public int getlast(){
        return this.bottom;
    }

    public void printstack(){
        for(int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i] + " ");
    }
}
