package payment;

public class RegularCustomer extends customer{

    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer name : " + name);
        System.out.println("Customer type is Regular");


    }
}
