package publisher_subscriber.message

// 발행자 인터페이스
interface Publisher {
    // 메시지를 발행
    fun publish(message: Message)
}