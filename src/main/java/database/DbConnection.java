package database;

import Entity.Account;
import Entity.Customer;

import java.sql.*;

public class DbConnection {
    public static Connection connect(){
        Connection connection = null;
        String dbFile = "jdbc:sqlite:src/main/resources/bank.db";
        try {
            connection = DriverManager.getConnection(dbFile);
            System.out.println("We are connected to the db");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static Customer getCustomer(String username){
        String query = "select * from Customer where username = ?";
        Customer customer = null;
        try(Connection connection = connect();
            PreparedStatement statement = connect().prepareStatement(query);){

            statement.setString(1, username);
            statement.executeUpdate();
            try(ResultSet resultSet = statement.executeQuery()){
                customer = new Customer(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getInt("accountId")
                        );
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return customer;
    }

    public static Account getAccount(int accountId){
        String query = "select * from Accounts where id = ?";
        Account account = null;
        try(Connection connection = connect();
            PreparedStatement statement = connect().prepareStatement(query)
        ){
            statement.setInt(1, accountId);
            statement.executeUpdate();
            try(ResultSet set = statement.executeQuery()){
                account = new Account(
                        set.getInt("id"),
                        set.getString("type"),
                        set.getDouble("balance")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return account;
    }
}
