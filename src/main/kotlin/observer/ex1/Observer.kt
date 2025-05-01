package observer.ex1

// 관찰자
interface Observer {
    // 알림을 받은 관찰자는 update 기능으로 정해진 대응
    fun update(news: String)
}