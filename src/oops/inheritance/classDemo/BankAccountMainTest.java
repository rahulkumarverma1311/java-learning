package oops.inheritance.classDemo;

public class BankAccountMainTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber("abc");
//        bankAccount.setAccountBalance(34234);
//        bankAccount.setCustomerName("raja");
//        bankAccount.setEmail("raja@gmail.com");
//        bankAccount.setPhoneNumber("9211420420");
        System.out.println(bankAccount.toString());

        bankAccount.deposit(2000);
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.withdrawal(2000);
        System.out.println(bankAccount.getAccountBalance());
    }
}
