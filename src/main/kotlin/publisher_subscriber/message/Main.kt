package publisher_subscriber.message

fun main() {
    val broker = Broker()

    val publisher = NewsPublisher(broker)

    val subscriber1 = NewsSubscriber("Subscriber 1")
    val subscriber2 = NewsSubscriber("Subscriber 2")

    broker.subscribe("sports", subscriber1)
    broker.subscribe("sports", subscriber2)
    broker.subscribe("weather", subscriber2)

    publisher.publish(Message("Liverpool won the match", "sports"))
    publisher.publish(Message("It's sunny today", "weather"))
}