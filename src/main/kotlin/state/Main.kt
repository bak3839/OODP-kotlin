package state

fun main() {
    val door = Door()

    door.close() // Door is already closed.

    door.open() // Door is now open.
    door.open() // Door is already open.

    door.close() // Door is now closed
    door.close() // Door is already closed.
}