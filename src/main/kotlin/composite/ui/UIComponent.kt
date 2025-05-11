package composite.ui

interface UIComponent {
    fun render()
    fun add(uiComponent: UIComponent)
    fun remove(uiComponent: UIComponent)
}
