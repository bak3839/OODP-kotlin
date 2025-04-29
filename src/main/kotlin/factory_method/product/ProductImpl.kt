package factory_method.product

class Electronics: Product {
    override fun create() {
        println("Electronics product created.")
    }
}

class Clothing: Product {
    override fun create() {
        println("Clothing product created.")
    }
}

class Book: Product {
    override fun create() {
        println("Book product created.")
    }
}