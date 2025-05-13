package publisher_subscriber.market

import java.util.concurrent.Executors

// 브로커
class EmailDeliveryService {
    private val customerGroups = mutableMapOf<String, MutableList<Customer>>()
    private val executor = Executors.newCachedThreadPool()

    fun subscribe(eventType: String, customer: Customer) {
        customerGroups.computeIfAbsent(eventType) { mutableListOf() }
            .add(customer)
    }

    fun sendEmails(eventType: String, message: String) {
        val customers = customerGroups[eventType]

        customers?.forEach {
            executor.submit { it.receiveEmail(message) }
        }
    }

    fun shutdown() {
        executor.shutdown()
    }
}