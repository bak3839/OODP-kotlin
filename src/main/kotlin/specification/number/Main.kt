package specification.number

fun main() {
    val evenSpec = EvenSpecification()
    val rangeSpec = RangeSpecification(10, 20)

    // 짝수 명세와 범위 명세가 AND 연산으로 결합
    val evenAndInRangeSpec = evenSpec.and(rangeSpec)

    val number = 24

    println("Even: ${evenSpec.isSatisfiedBy(number)}")
    println("In range 10-20: ${rangeSpec.isSatisfiedBy(number)}")
    println("Even and in range 10-20: ${evenAndInRangeSpec.isSatisfiedBy(number)}")
}