package command.text_editor

import java.util.Stack

class TextEditorInvoker {
    private val undoStack: Stack<Command> = Stack()
    private val redoStack: Stack<Command> = Stack()

    fun executeCommand(command: Command) {
        command.execute() // 커맨드 실행
        undoStack.push(command) // 취소 할 수 있도록 스택에 추가
        redoStack.clear() // 다시 실행은 실행 취소 직후에만 할 수 있으므로 비워줌
    }

    fun undo() {
        if(!undoStack.isEmpty()) {
            val command = undoStack.pop()
            command.undo()
            redoStack.push(command)
        }
    }

    fun redo() {
        if(!redoStack.isEmpty()) {
            val command = redoStack.pop()
            command.execute()
            undoStack.push(command)
        }
    }
}