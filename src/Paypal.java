class Paypal {
    public String processPayment(double amount, String currency) {
        System.out.println("Procesando con Paypal: " + amount + " " + currency);
        return "SUCCESS";
    }
}