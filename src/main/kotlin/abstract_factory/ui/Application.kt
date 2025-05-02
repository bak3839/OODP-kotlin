package abstract_factory.ui

class Application(
    // 윈도우 or 맥 팩토리의 인스턴스가 들어옴
    private val factory: GUIFactory
) {
    // OS의 팩토리로 버튼과 체크박스 생성
    private val button: Button  = factory.createButton()
    private val checkbox: Checkbox = factory.createCheckbox()

    fun paint() {
        button.paint()
        checkbox.paint()
    }
}