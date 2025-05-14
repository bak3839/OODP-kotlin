package iterator.collection

interface Collection {
    fun createIterator(): MyIterator
}

class MyList(
    private val size: Int,
    private var items: Array<Any> = Array(size) {}
): Collection {
    private var last: Int = 0

    fun add(item: Any) {
        if(last < items.size) {
            items[last] = item
            last++
        }
    }

    fun get(index: Int): Any = items[index]

    fun size(): Int = last

    override fun createIterator(): MyIterator {
        return MyListIterator(this)
    }
}