package publisher_subscriber.message

class Broker {
    // 메시지의 topic 별로 구독자들의 리스트 보유
    private val subscribers = mutableMapOf<String, MutableList<Subscriber>>()

    fun subscribe(topic: String, subscriber: Subscriber) {
        subscribers.computeIfAbsent(topic) { mutableListOf() }
            .add(subscriber)
    }

    fun publish(message: Message) {
        // topic 구독한 구독자들 목록을 조회
        val topicSubscribers = subscribers[message.topic]
        // 리스트에 등록된 구독자들에게 메시지 전달
        topicSubscribers?.forEach { it.update(message) }
    }
}