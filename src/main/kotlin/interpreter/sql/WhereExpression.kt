package interpreter.sql

class WhereExpression(
    val column: String,
    val operator: String,
    val value: String,
    val tableName: String
): Expression {
    override fun interpret(context: Context): List<Map<String, String>> {
        val result = mutableListOf<Map<String, String>>()
        val table = context.getTable(tableName)

        table?.forEach {
            if(evaluate(it[column]!!, operator, value)) {
                result.add(it)
            }
        }
        return result
    }

    private fun evaluate(columnValue: String, operator: String, value: String): Boolean {
        return when(operator) {
            "=" -> columnValue == value
            ">" -> columnValue.toInt() > value.toInt()
            "<" -> columnValue.toInt() < value.toInt()
            else -> false
        }
    }
}