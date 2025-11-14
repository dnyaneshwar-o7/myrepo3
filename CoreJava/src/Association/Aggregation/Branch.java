package Association.Aggregation;

import javax.xml.namespace.QName;

class Bank{
    String NameofBank;
    int Ifsc;

    public Bank(String nameofBank, int ifsc) {
        NameofBank = nameofBank;
        Ifsc = ifsc;
    }

    public void displayAllDetails(Customer customer){

        System.out.println("Name of the Bank" + NameofBank);
        System.out.println("Ifsc of Bank" + Ifsc);

        System.out.println("Name of the customer " + customer.nameofCustomer);
        System.out.println("Accountnumber of customer" + customer.accountnumber);
        System.out.println("Amount of customer" + customer.amount);
    }
}

class Customer{
    String nameofCustomer;
    int accountnumber;
    int amount;

    public Customer(String nameofCustomer, int accountnumber, int amount) {
        this.nameofCustomer = nameofCustomer;
        this.accountnumber = accountnumber;
        this.amount = amount;
    }
}
public class Branch {

    public static void main(String[] args) {
        Bank bank =new Bank("  Axis", 123456);
       Customer customer=new Customer("  Ram", 12159, 4567);
       bank.displayAllDetails(customer);

    }
}
