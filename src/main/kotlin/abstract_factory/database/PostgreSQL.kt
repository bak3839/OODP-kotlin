package abstract_factory.database

class PostgreSQLConnection: Connection {
    override fun open() {
        println("Opening PostgreSQL connection")
    }

    override fun close() {
        println("Closing PostgreSQL connection")
    }
}

class PostgreSQLCommand: Command {
    override fun execute(query: String) {
        println("Executing PostgreSQL query: $query")
    }
}

class PostgreSQLResultSet: ResultSet {
    override fun getResults() {
        println("Getting results from PostgreSQL database")
    }
}

class PostgreSQLFactory: DatabaseFactory {
    override fun createConnection(): Connection {
        return PostgreSQLConnection()
    }

    override fun createCommand(): Command {
        return PostgreSQLCommand()
    }

    override fun createResultSet(): ResultSet {
        return PostgreSQLResultSet()
    }
}