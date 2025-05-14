package iterator.collection

fun main() {
    val list = MyList(3)
    list.add("A")
    list.add("B")
    list.add("C")

    val iterator = list.createIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}