package abstract_factory.ui

fun main() {
    // 윈도우의 팩토리를 생성하여
    val windowsFactory = WindowsFactory()
    // Application 생성자의 인자로 넣음
    val windowsApp = Application(windowsFactory)
    windowsApp.paint()

    val macOSFactory = MacOSFactory()
    val macApp = Application(macOSFactory)
    macApp.paint()
}