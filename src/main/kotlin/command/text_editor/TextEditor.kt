package command.text_editor

class TextEditor {
    private var content = StringBuilder()

    fun insertText(text: String, position: Int) {
        content.insert(position, text)
    }

    fun deleteText(position: Int, length: Int) {
        content.delete(position, position + length)
    }

    fun getTextSubstring(start: Int, end: Int): String
    = content.substring(start, end)

    fun getContent(): String
    = content.toString()
}