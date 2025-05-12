package interpreter.sql

import java.util.Collections

class SelectExpression(
    val tableName: String,
    val columns: List<String>,
    val whereClause: Expression?,
):Expression {
    override fun interpret(context: Context): List<Map<String, String>> {
        val table = context.getTable(tableName)
        val result = mutableListOf<Map<String, String>>()

        table?.forEach {
            val rowContext = Context()
            rowContext.setTable(
                tableName, Collections.singletonList(it)
            )

            if(whereClause == null || whereClause.interpret(rowContext).isNotEmpty()) {
                val newRow = mutableMapOf<String, String>()

                for(column in columns) {
                    when(column == "*") {
                        true -> newRow.putAll(it)
                        false -> newRow[column] = it[column]!!
                    }
                }
                result.add(newRow)
            }
        }

        return result
    }
}