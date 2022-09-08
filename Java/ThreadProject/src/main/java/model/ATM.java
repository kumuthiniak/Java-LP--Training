package model;

public class ATM
{
    public static void main(String[] args) {

        BankAccount account =new BankAccount();
        BankCustomer customer =new BankCustomer(account);

        Thread gf = new Thread(customer);
        Thread bf = new Thread(customer);

        gf.setName("Latha");
        bf.setName("Ram");

        gf.start();
        bf.start();
    }
}
