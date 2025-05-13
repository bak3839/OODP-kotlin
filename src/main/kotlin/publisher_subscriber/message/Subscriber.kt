package publisher_subscriber.message

// 구독자 인터페이스
interface Subscriber {
    // 발행자의 메시지를 받아 상태를 업데이트
    fun update(message: Message)
}