package mediator.chat

class ChatMediatorImpl: ChatMediator {
    private var users = mutableListOf<User>()

    override fun sendMessage(message: String, user: User) {
        // 메시지를 보내는 사용자를 제외한 사용자들에게 발신
        for (u in users) {
            if(u != user) {
                u.receive(message)
            }
        }
    }

    override fun addUser(user: User) {
        this.users.add(user)
    }
}