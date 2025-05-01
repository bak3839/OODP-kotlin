package observer.ex1

class NewsAgency: Subject {
    private var observers = mutableListOf<Observer>()
    private var news = ""

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for(observer in observers) {
            observer.update(news)
        }
    }

    // 새로운 소식을 받음
    fun setNews(news: String) {
        this.news = news
        // 새로운 소식을 받으면 관찰자에게 알림
        notifyObservers()
    }
}