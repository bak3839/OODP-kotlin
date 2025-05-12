package interpreter.sql

class SQLParser {
    companion object {
        fun parse(query: String): Expression {
            val parts = query.split("\\s+".toRegex())

            if(!parts[0].equals("SELECT")) {
                throw RuntimeException("Only SELECT statements are supported")
            }

            val columns = parts[1].split(",")
            val tableName = parts[3]

            var whereClause: Expression? = null
            if(parts.size > 4 && parts[4].equals("WHERE")) {
                whereClause = WhereExpression(
                    tableName = tableName,
                    column = parts[5],
                    operator = parts[6],
                    value = parts[7],
                )
            }

            return SelectExpression(tableName = tableName, columns = columns, whereClause = whereClause)
        }
    }
}