package strategy

class CreditCardPayment(
    private val name: String,
    private val cardNumber: String
): PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid with credit card")
    }
}

class PaypalPayment(
    private val email: String
): PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid using paypal")
    }
}