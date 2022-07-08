//This has all the assignment 5 program related to the Students in 5th Assignment.

import java.util.*;

class Students {

    public static final Scanner sc = new Scanner(System.in);

    static Student topper(Student[] arr){
        float high =0f;
        int obj =0;
        for(int i=0; i < arr.length; i++){
            if(arr[i].getScore() > high){
                obj = i;
                high = arr[i].getScore();
            }
        }
        return arr[obj];
    }

    static Student[] sortedName(Student[] arr){
        for(int i =0; i < arr.length; i++){
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j].getBranch().compareTo(arr[j+1].getBranch())>0){
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Student Anuj = new Student(21,"Anuj","CS",96.5f);
        Student Anish = new Student(19,"Anish","AB",92.5f);
        Student Akash = new Student(10,"Akash","AJ",94.5f);
        Student Vinai = new Student(33,"Vinai","AC",91.5f);

        Student[] array = {Anuj,Anish,Akash,Vinai};

        int n = 1;

        //Menu Driven
        while(n>0){
            System.out.println("Enter 1 to print Sorted names and 2 to find the Topper and any other num to exit.");
            int s = sc.nextInt();

            if(s == 1 ){
                array = sortedName(array);
                for(int i=0;i<array.length;i++){
                    System.out.print(array[i].getName()+", ");
                }
                System.out.println();
            }
            else if(s == 2){
                Student top = topper(array);
                System.out.println("Topper is "+top.getName());
            }
            else
            n = 0;
        }
        // REMOVE THE // FROM BELOW TO CHECK THE WORKING OF SECOND CONSTRUCTOR
        //Student demo = new Student(21, "AJ", "CS", true);
        //System.out.print(demo.getScore()); this will ask the score at the time of printing.
    }
    
}

class Student{
    private int id;
    private String name;
    private String branch;
    private float score;
    private boolean secondChance;

    public static final Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     String getBranch() {
        return branch;
    }

     void setBranch(String branch) {
        this.branch = branch;
    }

     float getScore() {
        return score;
    }

     void identifyMarks(float score) {
        this.score = score;
    }

     boolean isSecondChance() {
        return secondChance;
    }

     void setSecondChance(boolean secondChance) {
        this.secondChance = secondChance;
    }
     void identifyMarks(float score1, float score2){
         if( score1 > score2 )
         this.score = score1;
         else
         this.score = score2;
     }

    Student(int id, String name, String branch, float score){

        setBranch(branch);
        setId(id);
        setName(name);
        identifyMarks(score);
    }
    Student(int id, String name, String branch, Boolean secondChance){

        if(secondChance){
            System.out.println("Enter first score");
            float score1 = sc.nextFloat();
            System.out.println("Enter the second attempt score");
            float score2 = sc.nextFloat();

            identifyMarks(score1, score2);
        }
        else{
            System.out.println("Enter the marks scored ");
            float score1 = sc.nextFloat();
            identifyMarks(score1);
        }
    }
}
