package memento.game

// Originator
class Game {
    private var level: String = ""
    private var score: Int = 0

    fun set(level: String, score: Int) {
        this.level = level
        this.score = score
        println("Game state set to - Level: $level, Score: $score")
    }

    fun save(): GameMemento = GameMemento(level, score)

    fun restore(memento: GameMemento) {
        this.level = memento.getLevel()
        this.score = memento.getScore()
        println("Game state saved to - Level: $level, Score: $score")
    }
}