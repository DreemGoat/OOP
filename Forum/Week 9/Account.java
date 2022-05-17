public class Account{
    private double balance;
    public double[] currency_amount = {0,0,0,0,0};

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit (double amt){
        return (amt>0);
    }

    public void changedepositamount(double amount){
        if (deposit(amount)){
            balance = balance + amount;
        }else{
            System.out.println("Invalid input, can't deposit a negative number.");
        }
    }

    public boolean withdraw(double amt){
        return (amt<balance);
    }

    public void changewithdrawamount(double amount){
        if (deposit(amount)){
            balance = balance - amount;
        } else {
            System.out.println("Invalid input, you do not have that much money in your deposit");
        }
    }

    public void buycurrency(int currency, int amount, int price){
        currency_amount[currency] = currency_amount[currency] + amount;
        balance = balance - price;
    }
}