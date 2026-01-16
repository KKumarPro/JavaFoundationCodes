public class BankAccountInfo {
    public static void main(String[] args)
    {
        BankAccount BA1 = new BankAccount(1234567890, "Karan Kumar", 100.65);
        BankAccount BA2 = new BankAccount(1087654321, "Paro Devi", 250.98);

        BA1.deposit(10000);
        BA2.deposit(10000);

        BA1.withdraw(100);
        BA2.withdraw(260);

        BA1.setBalance(1000);
        BA1.getBalance();
    }
}

class BankAccount{
    double accountNumber;
    String holderName;
    private double balance;

    BankAccount(double an, String hn, double b)
    {
        this.accountNumber = an;
        this.holderName = hn;
        this.balance = b;
    }
    public void setBalance(int bal)
    {
        if(bal>0)
            this.balance = bal;
    }
    public double getBalance()
    {
        System.out.println("Balance "+balance);
        return balance;
    }

    void deposit(int amount)
    {
        if(amount>0)
            System.out.println("Amount Deposited Successful! Total Balance: "+(amount+balance));
        else
            System.out.println("Invalid Deposit!");
    }
    void withdraw(int amount)
    {
        if((balance-amount)>0 && amount>0)
            System.out.println("Amount Withdraw Successful! Total Balance: "+(balance-amount));
        else
            System.out.println("Invalid Withdraw!");
    }
}