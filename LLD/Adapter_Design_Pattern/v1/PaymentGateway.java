package v1;

public interface PaymentGateway {

     String payViaCC(String card, int cvv, int expdate, int expmonth, double amount,String name);

     Status checkPaymentStatus(String id);

}
