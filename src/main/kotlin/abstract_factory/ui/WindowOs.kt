package abstract_factory.ui

class WindowsButton: Button {
    override fun paint() {
        println("Rendering a button in Windows style")
    }
}

class WindowsCheckbox: Checkbox {
    override fun paint() {
        println("Rendering a checkbox in Windows style")
    }
}