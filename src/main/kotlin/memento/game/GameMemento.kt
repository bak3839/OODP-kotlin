package memento.game

// 게임의 저장된 한 상태를 나타내는 클래스
// 게임 저장 시 해당 클래스의 인스턴스가 생성되어 보관
class GameMemento(
    private val level: String,
    private val score: Int
) {
    fun getLevel(): String = level
    fun getScore(): Int = score
}