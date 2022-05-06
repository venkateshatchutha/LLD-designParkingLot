public class Razorpayadapter implements PaymentMethod{
    @Override
    public void entercarddetails(String cardnumber, int cvv) {

    }

    @Override
    public boolean pay() {
        return false;
    }
}
