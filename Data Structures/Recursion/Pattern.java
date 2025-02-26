
public class Pattern{

    public static void main(String[] args) {   
        System.out.println("Number of shapes required = "+getShapeforColumns(7)+" or it is = "+minShapes(7));
    }

    static int getShapeforColumns(int n){

        int piecesReq = 2 * n;

        if(n <= 0)
            return 0;
        else if(n <= 2)
            return piecesReq;
        else if(n==3)
            return 4;
        else if(n==4)
            return 4;
        else 
            return (4 + (getShapeforColumns(n-4)));
    }

    public static int minShapes(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        return Math.min(1 + minShapes(n - 1),
                        Math.min(1 + minShapes(n - 2),
                                 2 + minShapes(n - 2)));
    }
}