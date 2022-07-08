public class Encapsulation {

    public static void main(String args[]){

    Introduction anuj = new Introduction();
    anuj.setName("Anuj Suryavanshi");
    anuj.setRoll_no(17);
    anuj.setCollege("LU");
    anuj.setDOB("26th June 2000");

    System.out.println("Name - "+anuj.getName() + " Roll-" +anuj.getRoll_no());

    }
    
}
class Introduction{

    private String name;
    private int roll_no;
    private String college;
    private String DOB;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int roll_no) {
        if( roll_no > 17 )
        this.roll_no = roll_no;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String dOB) {
        DOB = dOB;
    }
    
}

class Marks{


    private float physics;
    private float chem;
    private float math;
    private float computer;

    public float getPhysics() {
        return physics;
    }
    public void setPhysics(float physics) {
        this.physics = physics;
    }
    public float getChem() {
        return chem;
    }
    public void setChem(float chem) {
        this.chem = chem;
    }
    public float getMath() {
        return math;
    }
    public void setMath(float math) {
        this.math = math;
    }
    public float getComputer() {
        return computer;
    }
    public void setComputer(float computer) {
        this.computer = computer;
    }
}