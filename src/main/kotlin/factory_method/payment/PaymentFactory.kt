package factory_method.payment

abstract class PaymentFactory {
    abstract fun createPayment(info: FinancialInfo): Payment
}

class CreditCardPaymentFactory : PaymentFactory() {
    override fun createPayment(info: FinancialInfo): Payment {
        return CreditCardPayment(info.creditCardNumber)
    }
}

class PayPalPaymentFactory : PaymentFactory() {
    override fun createPayment(info: FinancialInfo): Payment {
        return PaypalPayment(info.payPalEmail)
    }
}

class BankTransferPaymentFactory : PaymentFactory() {
    override fun createPayment(info: FinancialInfo): Payment {
        return BankTransferPayment(info.bankAccountNumber)
    }
}
