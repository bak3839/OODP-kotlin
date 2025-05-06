package decorator.coffee

fun main() {
    val simpleCoffee = SimpleCoffee()
    println("${simpleCoffee.getDescription()} \$${simpleCoffee.getCost()}")

    val milkCoffee = MilkDecorator(SimpleCoffee())
    println("${milkCoffee.getDescription()} \$${milkCoffee.getCost()}")

    val milkAndSugarCoffee = SugarDecorator(MilkDecorator(SimpleCoffee()))
    println("${milkAndSugarCoffee.getDescription()} \$${milkAndSugarCoffee.getCost()}")
}