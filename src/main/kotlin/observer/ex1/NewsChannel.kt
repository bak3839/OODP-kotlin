package observer.ex1

class NewsChannel(
    private val name: String
): Observer {
    override fun update(news: String) {
        println("$name received news: $news")
    }
}