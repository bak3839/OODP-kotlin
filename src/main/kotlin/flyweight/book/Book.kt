package flyweight.book

class Book(
    // 이 클래스의 유일한 필드이므로 이 값이 같으면 같은 객체
    private val title: String, // intrinsic state (shared)
) {
    fun read() {
        println("Reading the book titled: $title")
    }
}