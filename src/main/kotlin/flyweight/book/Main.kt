package flyweight.book

fun main() {
    // Effective Java 처음으로 저장
    val book1 = Bookshelf.getBook("Effective Java")
    book1.read()

    // 이미 저장된 Effective Java 가져옴
    val book2 = Bookshelf.getBook("Effective Java")
    book2.read()

    val book3 = Bookshelf.getBook("Clean Code")
    book3.read()

    // 메모리상 위치가 동일한 하나의 인스턴스를 가리키는지 확인 -> hashcode 값이 같음
    println(if(book1 == book2) "Same book for 'Effective Java'." else "Different books for 'Effective Java'.")
}