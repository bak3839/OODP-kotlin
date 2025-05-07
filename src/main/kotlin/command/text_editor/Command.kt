package command.text_editor

interface Command {
    fun execute()
    fun undo()
}

class InsertTextCommand(
    private val editor: TextEditor,
    private val position: Int,
    private val text: String
) : Command {
    override fun execute() {
        editor.insertText(text, position)
    }

    override fun undo() {
        editor.deleteText(position, text.length)
    }
}

class DeleteTextCommand(
    private val editor: TextEditor,
    private val position: Int,
    private val length: Int
) : Command {
    private val deletedText: String = editor.getTextSubstring(position, position + length)

    override fun execute() {
        editor.deleteText(position, deletedText.length)
    }

    override fun undo() {
        editor.insertText(deletedText, position)
    }
}