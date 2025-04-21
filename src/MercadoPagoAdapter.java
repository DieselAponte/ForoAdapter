public class MercadoPagoAdapter implements PaymentProcessor {
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        // MercadoPago tampoco usa currency, lo ignoramos
        java.util.Map<String, Object> result = mercadoPago.executePayment(amount);
        return "approved".equals(result.get("status"));
    }
}
