package abstract_factory.database

// 이 명령들은 데이터베이스 종류에 따라서 클래스로 구현 될 것임
interface Connection {
    fun open()
    fun close()
}

interface Command {
    fun execute(query: String)
}

interface ResultSet {
    fun getResults()
}

// 이 셋의 인스턴스를 생성하는 추상 팩토리가 인스턴스로 작성
interface DatabaseFactory {
    fun createConnection(): Connection
    fun createCommand(): Command
    fun createResultSet(): ResultSet
}