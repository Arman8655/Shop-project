package payment;

public class PremiumCustomer extends customer{
    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer name : " + name);
        System.out.println("Customer type is Premium");

    }
}
