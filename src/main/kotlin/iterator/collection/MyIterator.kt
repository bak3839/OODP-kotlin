package iterator.collection

interface MyIterator {
    fun hasNext(): Boolean
    fun next(): Any?
}

class MyListIterator(
    private val list: MyList
): MyIterator {
    private var index = 0;

    override fun hasNext(): Boolean = index < list.size()

    override fun next(): Any? {
        if(this.hasNext()) return list.get(index++)
        return null
    }
}