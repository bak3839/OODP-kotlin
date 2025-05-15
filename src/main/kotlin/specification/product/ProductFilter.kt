package specification.product

import java.util.Collections

class ProductFilter {
    companion object {
        fun filter(items: List<Product>, spec: Specification): List<Product>
        = items.filter(spec::isSatisfiedBy)

        fun printProducts(products: List<Product>) {
            products.forEach {
                println("${it.name} - ${it.category} - ${it.price} - ${it.stock}")
            }
        }
    }
}