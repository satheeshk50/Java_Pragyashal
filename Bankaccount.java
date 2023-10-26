
class account{
    long accuount_number;
    String name;
    int balance;
    final int minbalance=3000;
    public account(long accuount_number,String name,int balance)
    {
        this.accuount_number=accuount_number;
        this.name=name;
        this.balance=balance;
    }
    private boolean checkMinbalance(amount)
    {
        return balance-amount<=minbalance?false:true;
    }
    public void balance_print()
    {
        System.out.println("Balance = "+balance);
    }
    public void deposit(amount)
    {
        this.balance = balance+amount;
    }
    public void withdraw(amount)
    {
        if(account.checkMinbalance(amount))
        {
            balance = balance-amount;
        }
        else{
            System.out.println("Transaction failed");
        }
    }
}
public class Bankaccount{
    public static void main(String[] args)
    {
        
    }
}