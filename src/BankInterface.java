
public interface BankInterface {
    int getBalance();
    String deposit(int amount);
    String withdraw(int amount,String password);
    double calculateInterest(int time);

}
