package interpreter.sql

// 열들로 이루어진 행을 다루기 위해 맵의 리스트를 반환값으로 설정
interface Expression {
    fun interpret(context: Context): List<Map<String, String>>
}