package factory_method.payment

fun main() {
    val userInfo = FinancialInfo(
        creditCardNumber = "1234-5678-9012-3456",
        payPalEmail = "user@example.com",
        bankAccountNumber = "987654321"
    )

    var factory: PaymentFactory = CreditCardPaymentFactory()
    var payment: Payment = factory.createPayment(userInfo)
    payment.processPayment(100.00)

    factory = PayPalPaymentFactory()
    payment = factory.createPayment(userInfo)
    payment.processPayment(200.00)

    factory = BankTransferPaymentFactory()
    payment = factory.createPayment(userInfo)
    payment.processPayment(300.00)
}