public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        // Stripe no usa currency, lo ignoramos
        return stripe.charge(amount);
    }
}