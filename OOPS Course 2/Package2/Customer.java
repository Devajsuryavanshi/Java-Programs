package Package2;

public class Customer{

    private long id;
    private String name;
    private char gender;
    private String email;
    private String contactNumber;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        gender = Character.toUpperCase(gender);
        if( gender == 'M' || gender == 'F')
        this.gender = gender;
        else
        System.out.println("Invalid Gender");
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String toString(Customer obj){
        System.out.println("Customer: " +obj.getName());
        return "Customer contact details :" +obj.getContactNumber()+", "+obj.getEmail();
    }

    public boolean equals(Customer[] obj){
        if(obj[0].getContactNumber().equalsIgnoreCase(obj[1].getContactNumber()) && obj[0].getEmail().equalsIgnoreCase(obj[1].getEmail()))
        return true;
        else
        return false;
    }
}