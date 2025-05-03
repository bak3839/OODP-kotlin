package mediator.chat

fun main() {
    val mediator = ChatMediatorImpl()

    val user1 = UserImpl(mediator, "John")
    val user2 = UserImpl(mediator, "Jane")
    val user3 = UserImpl(mediator, "Bob")
    val user4 = UserImpl(mediator, "Alice")

    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)
    mediator.addUser(user4)

    user1.send("Hi All")
}