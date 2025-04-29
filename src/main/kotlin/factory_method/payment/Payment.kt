package factory_method.payment

interface Payment {
    fun processPayment(amount: Double)
}

class CreditCardPayment(
    private val creditCardNumber: String
) : Payment {
    override fun processPayment(amount: Double) {
        println("Credit Card: $$amount")
    }
}

class PaypalPayment(
    private val payPalEmail: String
) : Payment {
    override fun processPayment(amount: Double) {
        println("Paypal: $$amount")
    }
}

class BankTransferPayment(
    private val bankAccountNumber: String
) : Payment {
    override fun processPayment(amount: Double) {
        println("Bank Transfer: $$amount")
    }
}