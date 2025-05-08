package memento.text_editor

import java.util.*

class Editor {
    private val document: Document = Document()
    private val history = Stack<DocumentMemento>()

    fun write(text: String) {
        history.push(document.save()) // 이전 상태 저장
        document.write(text) // 문서의 텍스트에 추가
    }

    fun undo() {
        // 마지막 메멘토를 가져옴
        val memento = if(history.isEmpty()) null else history.pop()

        memento?.let {
            // 문서 복원
            document.restore(it)
        }
    }

    fun getContent(): String = document.getContent()
}