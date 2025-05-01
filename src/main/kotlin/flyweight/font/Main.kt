package flyweight.font

fun main() {
    val font1 = FontFactory.getFont("Arial", 12, "Black")
    font1.apply("Hello World!")

    val font2 = FontFactory.getFont("Arial", 12, "Black")
    font2.apply("Flyweight Pattern!")

    val font3 = FontFactory.getFont("Times New Roman", 14, "Blue")
    font3.apply("Design Pattern!")

    val font4 = FontFactory.getFont("Arial", 12, "Black")
    font4.apply("Another Text")
}