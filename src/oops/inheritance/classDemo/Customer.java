package oops.inheritance.classDemo;

public class Customer {
    private String name;
    private String email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer() {
        this("ravi","ravi@gmail.com",45);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer(String email, String name) {
        this(name,email,40);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
