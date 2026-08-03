import razorpay.Razorpay;
import v0.FlipOrder;
import v1.RazorpayAdapter;

public class AdapterDesignPatternMain {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern module is ready.");


        v0.FlipOrder fp0=new FlipOrder();
        fp0.makPayment();


        RazorpayAdapter razorpayAdapter=new RazorpayAdapter();
        v1.FlipOrder fp1=new v1.FlipOrder( razorpayAdapter);
        fp1.makPayment();





    }
}
