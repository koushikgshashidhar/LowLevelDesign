package razorpay;

public class Razorpay {

    public Long paymentViaCC(int cardNo, int cvv, String cardHolderName, int  expMonthYear) {
        System.out.println("Payment done via Credit Card");
        return 123456789L; // Placeholder return value
    }
     public boolean checkPaymentStatus(Long id) {
        System.out.println("Checking payment status");
        return true; // Placeholder return value
    }
}
