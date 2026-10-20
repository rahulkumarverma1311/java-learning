package oops.inheritance.classDemo;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("ravi","ravi@",1000);

        System.out.println(customer.toString());

        Customer secCustomer = new Customer();
        System.out.println(secCustomer.toString());


        Customer customer1 = new Customer("wfwfe","ewfw");
        System.out.println(customer1.toString());
    }
}
