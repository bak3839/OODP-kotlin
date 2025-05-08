package memento.game

// 메멘토들을 저장하고 관리하는 역할
class GameCaretaker {
    private val mementoList = mutableListOf<GameMemento>()

    fun add(state: GameMemento) {
        mementoList.add(state)
    }

    fun get(index: Int): GameMemento = mementoList[index]
}