package command.light

interface Command {
    fun execute()
}

class LightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.turnOn()
    }
}

class LightOffCommand(
    private val light: Light
): Command {
    override fun execute() {
        light.turnOff()
    }
}