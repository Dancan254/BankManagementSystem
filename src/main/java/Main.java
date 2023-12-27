import Entity.Account;
import Entity.Customer;
import database.DbConnection;

import java.util.Scanner;

import static database.DbConnection.getAccount;
import static database.DbConnection.getCustomer;

public class Main {
    private Scanner scanner;
    public static void main(String[] args) {
        System.out.println("Welcome to Globe Bank International");
//        DbConnection.connect();
        Customer customer = getCustomer("Ian Dancan");
        Account account = getAccount(customer.getAccountId());
        System.out.println(customer.getName());
        System.out.println(customer.getAccountId());

    }

    public static void showMenu(){
        
    }
}
