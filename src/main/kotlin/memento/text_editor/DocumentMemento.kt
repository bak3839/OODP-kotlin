package memento.text_editor

class DocumentMemento(
    private val content: String,
) {
    fun getContent(): String = content
}