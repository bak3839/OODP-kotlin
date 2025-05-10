package chain_of_responsibility.handler

fun main() {
    val positive = PositiveHandler()
    val even = EvenHandler()
    val divisibleBy3 = DivisibleBy3Handler()

    positive.chainNext(even)
    even.chainNext(divisibleBy3)

    positive.handle(-2)
    positive.handle(4)
    positive.handle(6)
}