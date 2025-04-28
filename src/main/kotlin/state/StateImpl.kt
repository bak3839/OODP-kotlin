package state

class ClosedState: State {
    override fun open(door: Door) {
        println("Door is now open.")
        door.setState(OpenState())
    }

    override fun close(door: Door) {
        println("Door is already closed.")
    }
}

class OpenState: State {
    override fun open(door: Door) {
        println("Door is already open.")
    }

    override fun close(door: Door) {
        println("Door is now closed")
        door.setState(ClosedState())
    }
}