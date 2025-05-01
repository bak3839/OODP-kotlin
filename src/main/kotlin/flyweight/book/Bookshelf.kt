package flyweight.book

object Bookshelf {
    private val bookshelf = mutableMapOf<String, Book>()

    fun getBook(title: String): Book {
        // 해시맵에 해당 제목인 책이 있는지 확인
        var book = bookshelf.get(title)

        // 없다면 생성
        if(book == null) {
            book = Book(title)
            bookshelf.put(title, book)
            println("Adding a new book to bookshelf: $title")
        } else {
            // 있다면 해시맵에 이미 저장되어 있음
            println("Reusing existing book from the bookshelf: $title")
        }

        return book
    }
}
