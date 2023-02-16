import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name, Password, Balance for your Account");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBI sanketAccount = new SBI(name,password,balance);

        System.out.println("Your SBI Account is created successfully with Account no: " + sanketAccount.getAccountNo());

        //getBalance
        System.out.println("Current Balance : Rs." + sanketAccount.getBalance());

        //Deposit
        System.out.println("Enter Amount you want to deposit");
        System.out.println(sanketAccount.deposit(sc.nextInt()));
        System.out.println("Updated balance : Rs." + sanketAccount.getBalance());

        //Withdraw
        System.out.println("Enter Amount to withdraw");
        int amount = sc.nextInt();
        System.out.println("Enter your Password");
        String enteredPassword = sc.next();

        System.out.println(sanketAccount.withdraw(amount,enteredPassword));

        System.out.println("Updated balance : Rs." + sanketAccount.getBalance());

        //Interest
        System.out.println("Enter time in years you want interest");
        int n = sc.nextInt();
        System.out.println("Interest for " + n + " years on current balance " + sanketAccount.getBalance() + " is Rs." + sanketAccount.calculateInterest(n));

    }
}