package abstract_factory.database

class DatabaseClient(
    private val factory: DatabaseFactory
) {
    private val connection = factory.createConnection()
    private val command = factory.createCommand()
    private val resultSet = factory.createResultSet()

    fun performDatabaseOperations() {
        connection.open()
        command.execute("SELECT * FROM users")
        resultSet.getResults()
        connection.close()
    }
}

fun main() {
    val mysqlClient = DatabaseClient(MySQLFactory())
    mysqlClient.performDatabaseOperations()

    println("\nSwitching to PostgreSQL...\n")

    val postgresClient = DatabaseClient(PostgreSQLFactory())
    postgresClient.performDatabaseOperations()
}