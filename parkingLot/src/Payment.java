public class Payment {
    PaymentMethod paymentMethod;

    public Payment(String paymentapi){
        paymentMethod= paymentfactory.getpaymentmethod(paymentapi);
    }

    public boolean pay(){
        paymentMethod.entercarddetails("12222",133);
        return paymentMethod.pay();
    }
}
