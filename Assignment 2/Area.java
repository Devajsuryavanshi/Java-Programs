
// Question 8

import java.util.*;
public class Area {

    public static final Scanner sc = new Scanner(System.in);

    static void rectangle(){

        System.out.print("Please Enter the height of the rectangle =");
        float len = sc.nextFloat();
        System.out.println();
        System.out.print("Enter the width of  the rectangle = ");
        float width = sc.nextFloat();

        float area = len * width;
        System.out.println("Area ="+area);

    }
    static void triangle(){

        System.out.print("Enter the base of right angled triangle =");
        float base = sc.nextFloat();
        System.out.println();
        System.out.print("Enter the height of the Triangle =");
        float height = sc.nextFloat();
        float area = base * height * (1/2f);
        System.out.println("Area of triangle = "+area );

    }
    static void square(){

        System.out.print("Enter the side of square - ");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area = "+area);

    }
    static void circle(){

        System.out.print("Enter the radius of circle -");
        float radius = sc.nextFloat();
        float area = ((22/7f) * radius * radius);
        System.out.println("Area of circle = "+area);

    }

    public static void main(String[] args){

        System.out.print("Enter the figure you want the area for - ");
        String figure = sc.nextLine().toLowerCase();
        
        if( figure.equals("rectangle"))
        rectangle();

        else if( figure.equals("triangle"))
        triangle();

        else if( figure.equals("square"))
        square();

        else if( figure.equals("circle"))
        circle();

        else
        System.out.println("Please Enter the supported figure (Rectangle/Triangle/Square/Circle)");
    }
    
}
