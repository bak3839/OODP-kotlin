package memento.text_editor

import org.jcp.xml.dsig.internal.dom.DOMKeyInfo.getContent

fun main() {
    val editor = Editor()

    editor.write("Hello, ")
    editor.write("this is Memento pattern. ")
    println(editor.getContent())

    editor.undo()
    println(editor.getContent())

    editor.write("This is an example implemented in Kotlin")
    println(editor.getContent())
}