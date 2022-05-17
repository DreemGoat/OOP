import java.util.LinkedList;
import java.util.Arrays;

public class Bank {
    private LinkedList<String> customers = new LinkedList<String>();
    private int AmountOfCustomers;
    private String bank_name;
    private Customer customer;

    public String[] International_currency = {"US Dollars","Chinese Yuan","Indonesian Rupiah","UK Pounds","Australian Dollars"};
    public int[] Inter_currency_value = {10000, 1000, 10, 250, 5000};

    public Bank(String bankname, Customer customer){
        this.bank_name = bankname;
        this.customer = customer;
    }

    public String getBank_name(){
        return bank_name;
    }

    public void PrintBank_name(){
        System.out.println("This is the "+ bank_name +" bank");
    }
    public void addCustomer (String f, String l){
        customers.add(f+1);
    }

    public int getCustomer_amount(){
        return customers.size();
    }

    public String getCustomer(int index){
        return customers.get(index);
    }

    public Customer takeCustomer(){
        return customer;
    }

    public int[] exchange_currency(int currency, int amount){
        int[] arr = {};
        for (int i = 0; Inter_currency_value.length <5; i++){
            arr[i] = Inter_currency_value[i];
        }
        return arr;
    }

    private Object parseint(String string){
        return null;
    }
}
