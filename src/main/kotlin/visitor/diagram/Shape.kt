package visitor.diagram

interface Shape {
    fun accept(visitor: Visitor)
}

class Circle(
    private val radius: Double,
) : Shape {
    fun getRadius(): Double = radius

    // 방문자를 받아들이는 메소드
    // 클래스의 인스턴스 자신을 인자로 삼아 방문 메소드를 호출
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}

class Rectangle(
    private val width: Double,
    private val height: Double,
): Shape {
    fun getWidth(): Double = width

    fun getHeight(): Double = height

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}