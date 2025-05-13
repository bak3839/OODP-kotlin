package publisher_subscriber.message

class NewsPublisher(
    // 발행자는 브로커의 인스턴스를 필드로 보유
    // 발행자는 브로커를 알고, 브로커는 구독자를 알고 있는 구조
    private val broker: Broker
): Publisher {
    override fun publish(message: Message) {
        println("Publishing ${message.content} on Topic ${message.topic}")
        broker.publish(message)
    }
}