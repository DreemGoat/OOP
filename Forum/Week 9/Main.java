import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int op = 0;
        boolean check_deposit;
        boolean check_withdrawal;
        int pick_currency;
        int currency_amount;
        int currency_price;
        int withdrawal;
        int currency_choice;
    
        double money = 10000000;
    
        double deposit;
    
        System.out.println("Enter the name of the bank: ");
        String bankname = input.next();

        System.out.println("Enter your first name: ");
        String firstname = input.next();

        System.out.println("Enter your last name: ");
        String lastname = input.next();

        System.out.println('\n');

        Bank thisbank = new Bank(bankname, new Customer(firstname, lastname, new Account(250)));
        thisbank.PrintBank_name();

        thisbank.addCustomer(thisbank.takeCustomer().getFirst_Name(), thisbank.takeCustomer().getLast_name());

        System.out.println("Bank " + thisbank.getBank_name() + " has " + thisbank.getCustomer_amount() + " customer(s)");

        while (op<4){  
            System.out.println("Input (1) if you want to deposit money.");
            System.out.println("Input (2) if you want to withdraw some money.");
            System.out.println("Input (3) if you want to exchange your money to international currency.");
            System.out.println("Input (4) if you want to exit");

            op = input.nextInt();

            if(op == 1){
                System.out.println("Enter the amount you want to deposit: ");
                deposit = input.nextDouble();
    
                money = money + deposit;
                thisbank.takeCustomer().getAccount().changedepositamount(deposit);
    
                System.out.println("You now have " + money);
                System.out.println("Your bank balance is now " + thisbank.takeCustomer().getAccount().getBalance());
                System.out.println("");
            }
            else if (op == 2){
                System.out.println("Enter the amount you wish to withdraw: ");
                withdrawal = input.nextInt();

                money = money + withdrawal;
                thisbank.takeCustomer().getAccount().changewithdrawamount(withdrawal); 

                System.out.println("You now have " + money);
                System.out.println("Your bank balance is now " + thisbank.takeCustomer().getAccount().getBalance());
                System.out.println("");
            }
            else if (op == 3){
                for (int i = 1 ; i < thisbank.International_currency.length + 1;i++){
                    System.out.println("("+i+")" + thisbank.International_currency[i-1] + " = " + thisbank.Inter_currency_value[i-1]);
                }
                System.out.println("Enter the currency(1-5): ");
                currency_choice = input.nextInt();
                if (currency_choice == 1){
                    System.out.println("Enter the amount of " + thisbank.International_currency[0] + " you want: ");
                    currency_amount = input.nextInt();
                    currency_price = currency_amount*thisbank.Inter_currency_value[0];
                    System.out.println("exchanging to this currency costs: " + currency_price);

                    if(currency_price < thisbank.takeCustomer().getAccount().getBalance()){
                        thisbank.takeCustomer().getAccount().buycurrency(0, currency_amount, currency_price);
                    }else{
                        System.out.print("You don't have enough money in your deposit");
                    }
                }
                if (currency_choice == 2){
                    System.out.println("Enter the amount of " + thisbank.International_currency[1] + " you want: ");
                    currency_amount = input.nextInt();
                    currency_price = currency_amount*thisbank.Inter_currency_value[1];
                    System.out.println("exchanging to this currency costs: " + currency_price);

                    if(currency_price < thisbank.takeCustomer().getAccount().getBalance()){
                        thisbank.takeCustomer().getAccount().buycurrency(1, currency_amount, currency_price);
                    }else{
                        System.out.print("You don't have enough money in your deposit");
                    }
                }
                if (currency_choice == 3){
                    System.out.println("Enter the amount of " + thisbank.International_currency[2] + " you want: ");
                    currency_amount = input.nextInt();
                    currency_price = currency_amount*thisbank.Inter_currency_value[2];
                    System.out.println("exchanging to this currency costs: " + currency_price);

                    if(currency_price < thisbank.takeCustomer().getAccount().getBalance()){
                        thisbank.takeCustomer().getAccount().buycurrency(2, currency_amount, currency_price);
                    }else{
                        System.out.print("You don't have enough money in your deposit");
                    }
                }
                if (currency_choice == 4){
                    System.out.println("Enter the amount of " + thisbank.International_currency[3] + " you want: ");
                    currency_amount = input.nextInt();
                    currency_price = currency_amount*thisbank.Inter_currency_value[3];
                    System.out.println("exchanging to this currency costs: " + currency_price);

                    if(currency_price < thisbank.takeCustomer().getAccount().getBalance()){
                        thisbank.takeCustomer().getAccount().buycurrency(3, currency_amount, currency_price);
                    }else{
                        System.out.print("You don't have enough money in your deposit");
                    }
                }
                if (currency_choice == 5){
                    System.out.println("Enter the amount of " + thisbank.International_currency[4] + " you want: ");
                    currency_amount = input.nextInt();
                    currency_price = currency_amount*thisbank.Inter_currency_value[4];
                    System.out.println("exchanging to this currency costs: " + currency_price);

                    if(currency_price < thisbank.takeCustomer().getAccount().getBalance()){
                        thisbank.takeCustomer().getAccount().buycurrency(4, currency_amount, currency_price);
                    }else{
                        System.out.println("You don't have enough money in your account");
                    }
                }
                System.out.println("Your currency is now changed to: ");
                for (int i = 1; i < thisbank.International_currency.length +1; i++){
                    System.out.println("("+i+")" + thisbank.International_currency[i-1] + " = " + thisbank.takeCustomer().getAccount().currency_amount[i-1]);
                }
                System.out.println("And your current bank balance is " + thisbank.takeCustomer().getAccount().getBalance());
            }

        }
        System.out.println("Thank you for using our services");
        input.close();
    }
}
