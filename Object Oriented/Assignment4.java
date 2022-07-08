
import java.util.*;
class Assignment4 {
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.setName("Ashish");
        e1.setEmployeeNumber(12345);
        e1.setSalary(15000);

    }
}

class Company{

    protected String name;
    private Employee[] employees;
    public String getName() {
        return name;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}

class Employee extends Company{

    private String name;
    private int employeeNumber;
    private int salary;
    private Manager manager;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }

}

class Manager extends Employee{

    Employee[] manages;

    void addTeamMembers(Employee[] emp){
        this.manages = emp;
    }
    public Employee[] getTeammembers(){

        return manages;
    }

}

class Contractor extends Employee{

    private Date lengthOfContract;

    public Date getLengthOfContract() {
        return lengthOfContract;
    }

    public void setLengthOfContract(Date lengthOfContract) {
        this.lengthOfContract = lengthOfContract;
    }
}