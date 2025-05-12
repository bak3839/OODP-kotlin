package interpreter.sql

class Context {
    private val tables = mutableMapOf<String,List<Map<String, String>>>()

    init {
        val users: MutableList<Map<String, String>> = mutableListOf()
        users.add(mapOf(
            "id" to "1",
            "name" to "John",
            "age" to "30"
        ))
        users.add(mapOf(
            "id" to "2",
            "name" to "Jane",
            "age" to "25"
        ))

        tables["users"] = users
    }

    fun getTable(name: String) = tables[name]

    fun setTable(name: String, table: List<Map<String, String>>) {
        tables[name] = table
    }
}