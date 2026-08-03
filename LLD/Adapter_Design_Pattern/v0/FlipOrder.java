package v0;

import razorpay.Razorpay;

public class FlipOrder {

    Razorpay razorpay = new Razorpay();

    public Status makPayment() {
        //
        //
        //

        Long refId = razorpay.paymentViaCC(1424322, 123, "kowsik", 3827434);


        while(!razorpay.checkPaymentStatus( refId)) {
            System.out.println("Payment is processing...");
        }
        return Status.SUCCESS;

    }

}


// what solid is breaking