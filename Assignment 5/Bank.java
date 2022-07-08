public class Bank {

    public static void main(String args[]){

        Customer anuj = new Customer(941565,"Anuj");

        System.out.println(anuj.getCustName() +" "+ anuj.getCustid()+ " Balance = "+ anuj.getCustBalance()+ " Address- "+anuj.getCustAddress());

    }
}

class Customer{
    private int custid;
    private String custName;
    private String custAddress;
    private String Acctype;
    private double custBalance;

    public int getCustid() {
        return custid;
    }
    public void setCustid(int custid) {
        this.custid = custid;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustAddress() {
        if(custAddress != null)
        return custAddress;
        else
        return "Not filled";
    }
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    public String getAcctype() {
        if(Acctype != null)
        return Acctype;
        else
        return "Not set";
    }

    public void setAcctype(String acctype) {
        Acctype = acctype;
    }
    public double getCustBalance() {
        return custBalance;
    }
    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    Customer(int custid, String custName, String custAddress){
        setCustid(custid);
        setCustName(custName);
        setCustAddress(custAddress);
    }

    Customer(int custid, String custName){
        setCustid(custid);
        setCustName(custName);
    }

    Customer(int custid, String custName, String custAddress, double custBalance, String Acctype){
        setCustid(custid);
        setCustName(custName);
        setCustAddress(custAddress);
        setCustBalance(custBalance);
        setAcctype(Acctype);
    }
}