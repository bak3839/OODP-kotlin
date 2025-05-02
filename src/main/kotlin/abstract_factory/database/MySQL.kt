package abstract_factory.database

class MySQLConnection: Connection {
    override fun open() {
        println("Opening MySQL connection")
    }

    override fun close() {
        println("Closing MySQL connection")
    }
}

class MySQLCommand: Command {
    override fun execute(query: String) {
        println("Executing MySQL query: $query")
    }
}

class MySQLResultSet: ResultSet {
    override fun getResults() {
        println("Getting results from MySQL database")
    }
}

class MySQLFactory: DatabaseFactory {
    override fun createConnection(): Connection {
        return MySQLConnection()
    }

    override fun createCommand(): Command {
        return MySQLCommand()
    }

    override fun createResultSet(): ResultSet {
        return MySQLResultSet()
    }
}