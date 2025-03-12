package payment;

public class bitcoinPayment implements paymentStrategy{
    public String walletAddress ;

    public bitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress ;

    }



    @Override
    public void pay(double amount) {
        System.out.println("Your amount paid : " + amount);
        System.out.println("Payment Details : " + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        return "Pay with Bitcoin        Wallet Address : " + walletAddress;
    }
}
