//import Utilities.ArrayUtils;

class Intro{

    public static void main(String args[]){

        Student anuj = new Student(1808205880017l, "Lucknow University", "Anuj Suryavanshi", "BCA");

        System.out.println(anuj.getEnrolment_id() + " "+ anuj.getCollege() + " "+ anuj.getFull_name()+ " "+ anuj.getCourse());
        /* Done for Testing Purpose

        int[] a = {1,2,3,7,6,9,0};
        a = ArrayUtils.bubble_sort(a);
        for(int i =0; i< a.length; i++)
        System.out.print(a[i] + " ");
        System.out.println("Enter the array");
        int arr[][] = ArrayUtils.inputMatrix(3, 3);
        ArrayUtils.printMatrix(arr);
         
        */
    }
}

class Student{

    private long enrolment_id;
    private String college;
    private String full_name;
    private String course;

    public long getEnrolment_id() {
        return enrolment_id;
    }



    public void setEnrolment_id(long enrolment_id) {
        this.enrolment_id = enrolment_id;
    }



    public String getCollege() {
        return college;
    }



    public void setCollege(String college) {
        this.college = college;
    }



    public String getFull_name() {
        return full_name;
    }



    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }



    public String getCourse() {
        return course;
    }



    public void setCourse(String course) {
        this.course = course;
    }



    Student(long enrol_no, String coll, String Full_name, String course){
        setEnrolment_id(enrol_no);;
        setCollege(coll);;
        setFull_name(Full_name);;
        setCourse(course);;

    }
}