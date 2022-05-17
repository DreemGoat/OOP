public class Customer {
    private String First_name;
    private String Last_name;
    private Account account;

    public Customer(String Blobby, String Bobby, Account account){
        First_name = Blobby;
        Last_name = Bobby;
        this.account = account;
    }

    public String getFirst_Name(){
        return First_name;
    }

    public String getLast_name(){
        return Last_name;
    }

    public Account getAccount(){
        return account;
    }
}
