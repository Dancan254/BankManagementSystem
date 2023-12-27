package Entity;

public class Customer {
    private int id;
    private String name;
    private String userName;
    private String password;
    private int accountId;
    private boolean authenticated;
    //no args constructor
    public Customer() {
    }
    //all args constructor


    public Customer(int id, String name, String userName, String password, int accountId) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.accountId = accountId;
        setAuthenticated(false);
    }

    //getters & setters


    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
