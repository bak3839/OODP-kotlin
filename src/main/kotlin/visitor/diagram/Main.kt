package visitor.diagram

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    val areaVisitor = AreaVisitor()
    val perimeterVisitor = PerimeterVisitor()

    println("--- Calculating Area ---")
    circle.accept(areaVisitor)
    rectangle.accept(areaVisitor)

    println("\n--- Calculated Perimeter ---")
    circle.accept(perimeterVisitor)
    rectangle.accept(perimeterVisitor)
}