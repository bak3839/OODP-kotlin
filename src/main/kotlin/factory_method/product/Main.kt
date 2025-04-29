package factory_method.product

fun main() {
    // 팩토리 클래스 하나만 생정자가 호출되는 것을 확인할 수 있다.
    val factory = ConcreteProductFactory()

    // Create an electronics product
    val electronics = factory.orderProduct("electronics")

    // Create a clothing product
    val clothing = factory.orderProduct("clothing")

    // Create a book product
    val book = factory.orderProduct("book")
}