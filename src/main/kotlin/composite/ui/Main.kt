package composite.ui

import java.awt.TextField

fun main() {
    val submitButton = Button("Submit")
    val cancelButton = Button("Cancel")
    val usernameField = TextBox("Username")

    val formPanel = Panel("Form")
    formPanel.add(submitButton)
    formPanel.add(cancelButton)
    formPanel.add(usernameField)

    val window = Window("Main")
    window.add(formPanel)
    window.render()

    println()

    formPanel.remove(cancelButton)
    window.render()
}