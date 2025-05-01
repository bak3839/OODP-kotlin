package observer.ex1

// 관찰 대상
interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    // subject 변경이 생기면 해당 가능을 사용해 관찰자에게 알림
    fun notifyObservers()
}