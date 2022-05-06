public class paymentfactory {

    public static PaymentMethod getpaymentmethod(String paymentapi){
        if (paymentapi=="Razorpay"){
            return new Razorpayadapter();
        }else if(paymentapi=="payu") {
            return new payuadapeter();
        }else {
            return null;
        }
    }

}
