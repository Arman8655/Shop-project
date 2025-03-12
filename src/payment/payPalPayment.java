package payment;

public class payPalPayment implements paymentStrategy{
    public String email;

    public payPalPayment(String email){
        this.email = email ;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Your amount paid : " + amount);
        System.out.println("Payment Details : " + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        return "Pay with Paypal         PayPal Account : " + email;
    }
}

