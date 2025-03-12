package payment;

public class Main {
    public static void main(String[] args) {

        RegularCustomer arman = new RegularCustomer("Arman");
        PremiumCustomer pedram = new PremiumCustomer("Pedram");
        RegularCustomer gholi = new RegularCustomer("Gholi");


        creditCardPayment creditCard = new creditCardPayment("6104-5678-9012-3956", "Arman");
        payPalPayment payPal = new payPalPayment("shopproject@gmail.com");
        bitcoinPayment bitcoin = new bitcoinPayment("1Lbcfr7sAHDC9CgdZo3HTMTkV8MN4ZnX71");


        arman.displayCustomerInfo();
        pedram.displayCustomerInfo();
        gholi.displayCustomerInfo();


// شاید این که برای هر نفر دو روش پرداخت ایجاد شده یکم عجیب باشه ولی بنابر صحبت های تی هاست
        arman.makePayment(creditCard, 50.0);
        arman.makePayment(payPal, 30.0);

        pedram.makePayment(bitcoin, 60.0);
        pedram.makePayment(creditCard, 40.0);

        gholi.makePayment(payPal, 20.0);
        gholi.makePayment(bitcoin, 10.0);



        arman.showPaymentHistory();
        pedram.showPaymentHistory();
        gholi.showPaymentHistory();
    }
}
