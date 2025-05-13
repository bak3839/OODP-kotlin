package publisher_subscriber.message

class NewsSubscriber(
    private val name: String,
): Subscriber {
    // 브로커로부터 호출받아 메시지를 출력
    override fun update(message: Message) {
        println("$name: received ${message.content} on Topic ${message.topic}")
    }
}