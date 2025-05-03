package mediator.chat

abstract class User(
    // 중재자의 인스턴스를 필드로 가짐
    private val chatMediator: ChatMediator,
    private val name: String
) {
    abstract fun send(message: String)
    abstract fun receive(message: String)
}