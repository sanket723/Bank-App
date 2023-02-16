import java.util.UUID;

public class SBI implements BankInterface{
    private String accountNo;
    private String name;
    private String password;
    private int balance;
    private double rateOfInterest;

    //making user given field in constructor

    public SBI(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    //getter and setter functions

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    //interface implements methods

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String deposit(int amount) {
        this.balance += amount;
        return "Amount is credited with Rs." + amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(this.password.equals(enteredPassword)){
            if(balance >= amount) {
                this.balance -= amount;
                return "Amount is debited with Rs." + amount;
            }
            else
                return "Insufficient account balance";
        }

        return "Transaction declined. You entered wrong password";
    }

    @Override
    public double calculateInterest(int time) {
        //As we know =>  Interest = (Principal*Rate*Time)/100

        return (balance * rateOfInterest * time) / 100.0;
    }
}
