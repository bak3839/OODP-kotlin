package publisher_subscriber.market

interface Customer {
    fun receiveEmail(message: String)
}

class IndividualCustomer(
    private val name: String
) : Customer {
    override fun receiveEmail(message: String) {
        println("$name is receiving email async: $message")
        try {
            // 브로커가 동기적으로 처리한다면
            // 각 구독자는 이전 구독자가 메일을 읽기까지 5초를 기다려야함
            Thread.sleep(5000) // 이메일 읽기 시간
        } catch (e: InterruptedException) {
            Thread.currentThread().interrupt()
        }
        println("$name finished reading email: $message")
    }
}