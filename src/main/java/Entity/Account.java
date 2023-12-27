package Entity;

public class Account {
    private int id;
    private String type;
    private double balance;

    //no args constructor
    public Account() {
    }
    //all args constructor
    public Account(int id, String type, double balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
