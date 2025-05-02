package abstract_factory.ui

interface GUIFactory {
    // 이 둘은 구상 클래스가 아닌 인터페이스임을 기억
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}

// 팩토리도 추상 부분과 구상 부분으로 구성
// 각 OS에 맞게 반환
// 제품의 그룹별로 팩토리들이 구체화되어 있음
class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckbox(): Checkbox {
        return WindowsCheckbox()
    }
}

class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createCheckbox(): Checkbox {
        return MaxOSCheckbox()
    }
}