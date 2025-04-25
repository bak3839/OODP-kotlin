package singleton

fun main() {
    val button = Button("Submit")
    val textFiled = TextFiled("Enter your name")
    val label = Label("Username")

    button.display()
    textFiled.display()
    label.display()

    println("\nThemeColor Change To Dark...\n")
    Theme.getInstance().themeColor = "dark"

    button.display()
    textFiled.display()
    label.display()
}