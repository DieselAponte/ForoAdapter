public class PaypalAdapter implements PaymentProcessor {
    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        String result = paypal.processPayment(amount, currency);
        return "SUCCESS".equals(result);
    }
}
