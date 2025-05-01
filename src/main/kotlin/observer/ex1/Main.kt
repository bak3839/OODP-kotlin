package observer.ex1

fun main() {
    // subject 뉴스 에이전시 인스턴스 생성
    val agency = NewsAgency()

    // 관찰자들 생성 - 두 채널이 에이전시를 구독
    val channel1 = NewsChannel("Channel 1")
    val channel2 = NewsChannel("Channel 2")

    agency.registerObserver(channel1)
    agency.registerObserver(channel2)

    agency.setNews("Breaking news: Observer Pattern in action!")

    agency.removeObserver(channel2)

    agency.setNews("Another update: Channel 2 unsubscribed.")
}