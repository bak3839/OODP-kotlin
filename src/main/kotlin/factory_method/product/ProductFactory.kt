package factory_method.product

abstract class ProductFactory {
    abstract fun createProduct(type: String): Product

    fun orderProduct(type: String): Product {
        val product = createProduct(type)
        product.create()
        return product
    }
}

class ConcreteProductFactory: ProductFactory() {
    override fun createProduct(type: String): Product {
        return when (type) {
            "electronics" -> Electronics()
            "clothing" -> Clothing()
            "book" -> Book()
            else -> throw IllegalArgumentException("Unknown product type: $type")
        }
    }
}