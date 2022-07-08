public class LinebyLine {
    
    public static void main(String args[]){
        String s = "My Name is Random";
        String[] arr = s.split(" ");
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
