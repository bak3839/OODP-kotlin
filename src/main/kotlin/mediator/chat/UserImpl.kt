package mediator.chat

class UserImpl(
    private val chatMediator: ChatMediator,
    private val name: String
): User(chatMediator, name) {
    override fun send(message: String) {
        println("$name: Sending Message = $message")
        // 중재자의 send 메소드를 이와 같이 메시지를 인자로 넣어 호출
        chatMediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("$name: received Message = $message")
    }
}