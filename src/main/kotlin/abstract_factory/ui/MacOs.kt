package abstract_factory.ui

class MacOSButton: Button {
    override fun paint() {
        println("Rendering a button in MaxOS style")
    }
}

class MaxOSCheckbox: Checkbox {
    override fun paint() {
        println("Rendering a checkbox in MaxOS style")
    }
}