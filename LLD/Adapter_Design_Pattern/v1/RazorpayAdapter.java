package v1;

import razorpay.Razorpay;

public class RazorpayAdapter implements PaymentGateway{

    Razorpay razorpay= new Razorpay();
    @Override
    public String payViaCC(String card, int cvv, int expdate, int expmonth, double amount,String name) {
        int card1 = Integer.parseInt(card);
        int expmonYear= Integer.parseInt(String.valueOf(expmonth) + String.valueOf(expdate));

         Long id= razorpay.paymentViaCC(card1, cvv, name, expmonYear);

         return String.valueOf(id);
    }

    @Override
    public Status checkPaymentStatus(String id) {

        Long id1 = Long.parseLong(id);

        while (!razorpay.checkPaymentStatus(id1)) {
            System.out.println("Payment is still processing...");
            try {
                Thread.sleep(2000); // Wait for 2 seconds before checking again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return Status.SUCCESS;

    }
}
