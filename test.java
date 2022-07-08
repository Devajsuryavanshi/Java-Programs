class printer{

    public static void main(String[] args){
    
    char[] arr = {'a','b','c','d','e',' ','1','h','i','j'};
    for(int i = 0; i < 10;i++){
    System.out.print(arr[i]);
    }
    
    String[] arr1 = new String[5];
    System.out.println();
    System.out.println("Enter the String");
    for(int i = 0;i < 5;i++){
    arr1[i] = System.console().readLine();
    }
    System.out.println("Entered String");
    for(int i = 0; i< 5; i++)
    System.out.print(arr1[i] + " ");
    }
}
    