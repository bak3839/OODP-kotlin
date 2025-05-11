package composite.ui


class Button(
    private val label: String
) : UIComponent {
    override fun render() {
        println("Button: $label")
    }

    // 인터페이스 분리 원칙을 위반
    // 1. 클래스들의 일관성을 유지
    // 2. 시스템의 규모가 작을 때
    // -> 어느정도 허용
    override fun add(uiComponent: UIComponent) {
        throw UnsupportedOperationException()
    }

    override fun remove(uiComponent: UIComponent) {
        throw UnsupportedOperationException()
    }
}

class TextBox(
    private val text: String
) : UIComponent {
    override fun render() {
        println("TextBox: $text")
    }

    override fun add(uiComponent: UIComponent) {
        throw UnsupportedOperationException()
    }

    override fun remove(uiComponent: UIComponent) {
        throw UnsupportedOperationException()
    }
}