public class Main {
    public static void main(String[] args) {
                PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
                PaymentProcessor paypalProcessor = new PaypalAdapter(new Paypal());
                PaymentProcessor mercadoPagoProcessor = new MercadoPagoAdapter(new MercadoPago());

                System.out.println("Stripe: " + stripeProcessor.processPayment(50.0, "USD"));
                System.out.println("PayPal: " + paypalProcessor.processPayment(75.0, "EUR"));
                System.out.println("MercadoPago: " + mercadoPagoProcessor.processPayment(100.0, "PEN"));
            }
        }
