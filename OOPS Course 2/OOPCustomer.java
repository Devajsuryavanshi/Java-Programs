//Assignment 3 of the OOPS Concept

import java.util.*;
class OOPCustomer {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int n = sc.nextInt();
        Customer[] arr = new Customer[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the Name");
            String s = System.console().readLine();
            System.out.println("Enter user's Mobile number");
            String mno = System.console().readLine();
            System.out.println("Enter the Rating out of 5");
            double rating = sc.nextDouble();
            arr[i] = new Customer(s, mno, rating);
        }
        sc.close();
    }
}

class Customer{

    private String Name;
    private String MobileNo;
    private double feedbackRating;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getMobileNo() {
        return MobileNo;
    }
    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }
    public double getFeedbackRating() {
        return feedbackRating;
    }
    public void setFeedbackRating(double feedbackRating) {
        if(feedbackRating >= 0 && feedbackRating <= 5)
        this.feedbackRating = feedbackRating;
        else
        System.out.print("Rating not within 0-5");
    }

    Customer(){
        setFeedbackRating(0.0);
        setMobileNo("Not set");
        setName("No name");
    }
    Customer(String name, String mobileNo, double feedbackRating){
        setFeedbackRating(feedbackRating);
        setMobileNo(mobileNo);
        setName(name);
    }
}
