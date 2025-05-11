package composite.ui

class Panel(
    private val name: String,
): UIComponent {
    private val components = mutableListOf<UIComponent>()

    override fun render() {
        println("Panel: $name")
        components.forEach(UIComponent::render)
    }

    override fun add(uiComponent: UIComponent) {
        components.add(uiComponent)
    }

    override fun remove(uiComponent: UIComponent) {
        components.remove(uiComponent)
    }
}

class Window(
    private val title: String,
): UIComponent {
    private val components = mutableListOf<UIComponent>()

    override fun render() {
        println("Window: $title")
        components.forEach(UIComponent::render)
    }

    override fun add(uiComponent: UIComponent) {
        components.add(uiComponent)
    }

    override fun remove(uiComponent: UIComponent) {
        components.remove(uiComponent)
    }
}
