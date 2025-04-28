package state

class Door(
    private var state: State = ClosedState()
) {
    fun setState(state: State) {
        this.state = state
    }

    fun open() {
        state.open(this)
    }

    fun close() {
        state.close(this)
    }
}