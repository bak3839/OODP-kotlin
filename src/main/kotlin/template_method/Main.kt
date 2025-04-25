package template_method

fun main(args: Array<String>) {
    val tea: Beverage = Tea()
    val coffee: Beverage = Coffee()

    println("\nMaking tea...")
    tea.prepareRecipe()

    println("\nMaking coffee...")
    coffee.prepareRecipe()
}