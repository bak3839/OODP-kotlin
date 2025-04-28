package state

interface State {
    fun open(door: Door)
    fun close(door: Door)
}