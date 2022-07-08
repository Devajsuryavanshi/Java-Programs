// Assignment 2 of the JAVA OOPS

class Accounts{

    public static void main(String[] args){

        SavingAccount AJ = new SavingAccount(2021, 4, 21022);
        AJ.withDraw(2022);
        System.out.print(AJ.GetAccountNo());

    }
}

class SavingAccount{
    private double balance;
    private int interestRate;
    private int accountNo;

    public int GetAccountNo(){
        return this.accountNo;
    }

    SavingAccount(){
        this.balance = 0;
        this.interestRate = 3;
        this.accountNo = 0;
    }

    SavingAccount(double balance, int interestRate, int accountNo){

        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNo = accountNo;

    }

    void withDraw(double amount){
        if( amount > this.balance){
            System.out.println("Entered Amount is greater than available balance");
        }
        else{
        System.out.println("Amount withdrawn");
        this.balance -= amount;
        }
    }

    double CalculateInterest(){
        return (this.balance * (this.interestRate/100));
    }
    }