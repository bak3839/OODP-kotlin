package builder.pizza

fun main() {
    // 메소드 체이닝
    // 각 메소드가 PizzaBuilder 자신을 반환한 이유
    val pizza = Pizza.PizzaBuilder()
        .dough("Thin Crust")
        .sauce("Tomato")
        .topping("Cheese")
        .build()

    println(pizza)

    val orderType = "Veggie"

    val pizzaBuilder = Pizza.PizzaBuilder().dough("Regular")
    pizzaBuilder.sauce("Pesto")

    when(orderType) {
        "Veggie" -> pizzaBuilder.topping("Vegetables")
        else -> pizzaBuilder.topping("Pepperoni")
    }

    val customPizza = pizzaBuilder.build()
    println(customPizza)
}