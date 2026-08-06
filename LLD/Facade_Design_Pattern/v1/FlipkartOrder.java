package v1;

public class FlipkartOrder {

    public static void main(String[] args) {



    }

    public static void makePayment() {
        System.out.println("Payment made through Flipkart");
        PaymentHelper paymentHelper = new PaymentHelper();
        paymentHelper.makePayment();
    }
}
