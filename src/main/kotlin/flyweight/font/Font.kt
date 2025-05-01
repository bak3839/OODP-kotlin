package flyweight.font

interface Font {
    fun apply(text: String)
}

class ConcreteFont(
    // 이 값이 모두 같아야 재사용 가능한 객체
    private val font: String,
    private val size: Int,
    private val color: String,
) : Font {
    override fun apply(text: String) {
        println("Text: '$text ' with Font: $font , size: $size, color: $color")
    }
}