package specification.number

fun interface Specification {
    fun isSatisfiedBy(number: Int): Boolean

    // 이 메소드를 싱행한 명세와 매개변수 명세가
    // 주어진 정수에 모두 참을 반환하는지 여부 반납
    // 해당 명세와 다른 명세를 AND 연산으로 결합
    fun and(other: Specification): Specification
    = Specification { number ->
        this.isSatisfiedBy(number).and(other.isSatisfiedBy(number))
    }
}

class EvenSpecification(): Specification {
    override fun isSatisfiedBy(number: Int): Boolean
    = number.rem(2) == 0
}

class RangeSpecification(
    private val min: Int,
    private val max: Int
): Specification {
    override fun isSatisfiedBy(number: Int): Boolean
    = number in min..max
}