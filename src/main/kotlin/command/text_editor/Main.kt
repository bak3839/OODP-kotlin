package command.text_editor

fun main() {
    val editor = TextEditor()
    val invoker = TextEditorInvoker()

    val insertHello = InsertTextCommand(editor,0, "Hello, ")
    invoker.executeCommand(insertHello)

    val insertWorld = InsertTextCommand(editor,7, "World")
    invoker.executeCommand(insertWorld)

    println("Current text: ${editor.getContent()}")

    invoker.undo()
    println("After undo: ${editor.getContent()}")

    invoker.redo()
    println("After redo: ${editor.getContent()}")

    val deleteCommand = DeleteTextCommand(editor, 0, 7)
    invoker.executeCommand(deleteCommand)

    println("After delete: ${editor.getContent()}")

    invoker.undo()
    println("Final text: ${editor.getContent()}")
}