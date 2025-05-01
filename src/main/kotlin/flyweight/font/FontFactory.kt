package flyweight.font

object FontFactory {
    private var fontMap = mutableMapOf<String, Font>()

    fun getFont(font: String, size: Int, color: String): Font {
        val key = font + size + color
        var fontObject = fontMap[key]

        if (fontObject == null) {
            fontObject = ConcreteFont(font, size, color)
            fontMap[key] = fontObject
            println("Creating font: $key")
        } else {
            println("Reusing font: $key")
        }

        return fontObject
    }
}