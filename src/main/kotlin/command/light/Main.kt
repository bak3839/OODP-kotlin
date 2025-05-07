package command.light

fun main() {
    val livingRoomLight = Light()
    val lightOn = LightOnCommand(livingRoomLight)
    val lightOff = LightOffCommand(livingRoomLight)

    val remote = RemoteControl()

    remote.setCommand(lightOn)
    remote.pressButton()

    remote.setCommand(lightOff)
    remote.pressButton()
}
