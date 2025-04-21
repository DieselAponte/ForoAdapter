import java.util.Map;
public class MercadoPago {
    public Map<String, Object> executePayment(double amount) {
        System.out.println("Ejecutando pago con MercadoPago: $" + amount);
        java.util.Map<String, Object> response = new java.util.HashMap<>();
        response.put("status", "approved");
        return response;
    }
}
