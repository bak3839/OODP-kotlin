package prototype.person

fun main() {
    val original = Person("John", 30, "123 Main st")
    original.displayInfo()

    val cloned = original.clone()
    cloned.setAddress("456 Clone st")

    println("\nAfter cloning and modifying th clone:")
    original.displayInfo()
    cloned.displayInfo()
}