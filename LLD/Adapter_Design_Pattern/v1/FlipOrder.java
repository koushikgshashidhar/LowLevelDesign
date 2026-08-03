package v1;

import razorpay.Razorpay;

public class FlipOrder {

PaymentGateway paymentGateway;

public FlipOrder(PaymentGateway paymentGateway)
{
    this.paymentGateway = paymentGateway;
}

    public Status makPayment() {


        String refId = paymentGateway.payViaCC("1424322", 123, 1234, 2132,200.0,"kowsik");


        while(!paymentGateway.checkPaymentStatus( refId).equals(Status.SUCCESS)) {
            System.out.println("Payment is not success, retrying...");
        }
        return Status.SUCCESS;

    }

}


// what solid is breaking