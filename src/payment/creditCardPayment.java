package payment;

public class creditCardPayment implements paymentStrategy{
    public String cardNumber;
    public String cardHolderName;
    public creditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber ;
        this.cardHolderName = cardHolderName;
    }



        @Override
        public void pay(double amount) {
            System.out.println("Your amount paid : " + amount);
            System.out.println("Payment Details : " + getPaymentDetails());

        }


    @Override
    public String getPaymentDetails() {

        return "Pay with CreditCard         Card Number : " + cardNumber + "and Card Holder : " + cardHolderName;
    }
}
