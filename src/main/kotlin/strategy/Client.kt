package strategy


class Client

fun main(args: Array<String>) {
    val cart1 = ShoppingCart(
        CreditCardPayment(
            "John Doe",
            "1234567890"
        )
    )

    // 10000 paid with credit card
    cart1.checkout(10000)

    val cart2 = ShoppingCart(
        PaypalPayment(
            "oodp@test.com"
        )
    )

    // 20000 paid using paypal
    cart2.checkout(20000)
}


