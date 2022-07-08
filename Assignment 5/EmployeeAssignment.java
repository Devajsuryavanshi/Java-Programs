public class EmployeeAssignment {
    
    public static void main(String args[]){

        Employee emp = new Employee(27,"Anuj","Developer","TTH");

        System.out.println("Employee name - "+emp.getEmpName()+" With employee id "+emp.getEmpid() + " is a "+emp.getEmpDesig()+ " and works in " +emp.getEmpDept());

    }
}

 class Employee {

     private int empid;
     private String empName;
     private String empDesig;
     private String empDept;
     
     
     public int getEmpid() {
        return empid;
    }


    public void setEmpid(int empid) {
        this.empid = empid;
    }


    public String getEmpName() {
        return empName;
    }


    void setEmpName(String empName) {
        if( empName == "" )
        System.out.println("Enter a valid name");
        else
        this.empName = empName;
    }


    public String getEmpDesig() {
        return empDesig;
    }


    void setEmpDesig(String empDesig) {
        empDesig = empDesig.toLowerCase();
        if(empDesig.contentEquals("developer") || empDesig.contentEquals("tester") || empDesig.contentEquals("manager") || empDesig.contentEquals("lead"))
        this.empDesig = empDesig;
        else
        System.out.println("Invalid designation");
    }


    public String getEmpDept() {
        return empDept;
    }


    void setEmpDept(String empDept) {
        String up = empDept.toUpperCase();
        if(up.contentEquals("TTH") || up.contentEquals("RCM") || up.contentEquals("DEVOPS") || up.contentEquals("DIGITAL"))
        this.empDept = empDept;
        else
        System.out.println("Invalid Dept");
    }


    Employee(int empid, String empName, String empDesig, String empDept){
        setEmpDesig(empDesig);
        setEmpid(empid);
        setEmpDept(empDept);
        setEmpName(empName);
     }
 }