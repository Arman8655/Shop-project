package payment;

import java.util.ArrayList;

public abstract class customer {
    public String name;
    public ArrayList<String>paymentHistory;

    public customer(String name){
        this.name = name;
        this.paymentHistory = new ArrayList<>();

    }
    public abstract void displayCustomerInfo();
    public void makePayment(paymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        String paymentDetails = "Your payment of " + amount + " with using" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);
    }


    public void showPaymentHistory(){
        for (String history : paymentHistory){
            System.out.println(history);
        }
    }

}
