package decorator.coffee

interface Coffee {
    fun getDescription(): String
    fun getCost(): Double
}

class SimpleCoffee : Coffee {
    override fun getDescription(): String = "Simple coffee"
    override fun getCost(): Double = 5.0
}