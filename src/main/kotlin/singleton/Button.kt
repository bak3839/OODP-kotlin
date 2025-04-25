package singleton

class Button(
    private val label: String
) {
    fun display() {
        val themeColor = Theme.getInstance().themeColor
        println(
            "Button [$label] displayed in $themeColor theme."
        )
    }
}

class TextFiled(
    private val text: String
) {
    fun display() {
        val themeColor = Theme.getInstance().themeColor
        println(
            "TextFiled [$text] displayed in $themeColor theme."
        )
    }
}

class Label(
    private val text: String
) {
    fun display() {
        val themeColor = Theme.getInstance().themeColor
        println(
            "Label [$text] displayed in $themeColor theme."
        )
    }
}