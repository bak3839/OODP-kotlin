package adapter.message

fun main() {
    val oldSystem = OldMessageSystem()
    val adapter = MessageAdapter(oldSystem)

    adapter.sendMessage("Hello World!", "John@example.com")
}