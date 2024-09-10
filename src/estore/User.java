package estore;

public class User {
    private int age;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String homeAddress;
    private Customer customer;
    private Admin admin;
    private Seller seller;

    public User(int age, String name, String email, String password, String phone, String homeAddress) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.homeAddress = homeAddress;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;

    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}
