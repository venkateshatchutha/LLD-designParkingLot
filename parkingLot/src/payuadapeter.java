public class payuadapeter implements PaymentMethod{
    @Override
    public void entercarddetails(String cardnumber, int cvv) {

    }

    @Override
    public boolean pay() {
        return false;
    }
}
