package specification.product

fun main() {
    val products = listOf(
        Product("Laptop", "Electronics", 1200, 5),
        Product("Smartphone", "Electronics", 800, 0),
        Product("Headphones", "Electronics", 200, 10),
        Product("Book", "Literature", 20, 50),
    )

    val electronicsSpec = CategorySpec("Electronics")
    val inStockSpec = InStockSpec()
    val expensiveSpec = PriceSpec(500)

    val electronicAndInStock = AndSpec(electronicsSpec, inStockSpec)
    val electronicOrInStock = OrSpec(electronicsSpec, inStockSpec)
    val notExpensive = NotSpec(expensiveSpec)

    println("Electronics in stock:")
    ProductFilter.printProducts(
        ProductFilter.filter(products, electronicAndInStock)
    )

    println("\nElectronics or items in stock:")
    ProductFilter.printProducts(
        ProductFilter.filter(products, electronicOrInStock)
    )

    println("\nNot expensive items:")
    ProductFilter.printProducts(
        ProductFilter.filter(products, notExpensive)
    )
}