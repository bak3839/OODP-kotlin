package interpreter.sql

fun main() {
    val context = Context()

    val query1 = "SELECT * FROM users"
    val expr1 = SQLParser.parse(query1)
    val result1 = expr1.interpret(context)

    println("Result of query1 = $query1")
    result1.forEach(System.out::println)

    val query2 = "SELECT name,age FROM users WHERE age > 27"
    val expr2 = SQLParser.parse(query2)
    val result2 = expr2.interpret(context)

    println("\nResult of query2 = $query2")
    result2.forEach(System.out::println)
}