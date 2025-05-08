package memento.text_editor

// Originator
class Document {
    private var content = StringBuilder()

    fun write(text: String) {
        content.append(text)
    }

    fun getContent(): String = content.toString()

    fun save(): DocumentMemento = DocumentMemento(content.toString())

    fun restore(memento: DocumentMemento) {
        this.content = StringBuilder(memento.getContent())
    }
}