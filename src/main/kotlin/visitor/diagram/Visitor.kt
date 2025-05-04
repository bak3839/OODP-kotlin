package visitor.diagram

// 매개변수의 자료형마다 메소드를 따로 구현 -> 메소드 오버로딩
// 도형이 추가되면 방문자에 visit 메소드가 추가됨
interface Visitor {
    fun visit(circle: Circle)
    fun visit(rectangle: Rectangle)
}

class AreaVisitor : Visitor {
    override fun visit(circle: Circle) {
        val area = Math.PI * circle.getRadius() * circle.getRadius()
        println("Circle Area: $area")
    }

    override fun visit(rectangle: Rectangle) {
        val area = rectangle.getHeight() * rectangle.getWidth()
        println("Rectangle Area: $area")
    }
}

class PerimeterVisitor: Visitor {
    override fun visit(circle: Circle) {
        val perimeter = 2 * Math.PI * circle.getRadius()
        println("Circle Perimeter: $perimeter")
    }

    override fun visit(rectangle: Rectangle) {
        val perimeter = 2 * (rectangle.getHeight() + rectangle.getWidth())
        println("Rectangle Perimeter: $perimeter")
    }
}