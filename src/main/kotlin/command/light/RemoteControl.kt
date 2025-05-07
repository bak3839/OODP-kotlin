package command.light

class RemoteControl {
    private var command: Command? = null

    // 명령을 장착
    fun setCommand(command: Command) {
        this.command = command
    }

    // 실행하면 장착된 명령이 실행
    fun pressButton() {
        command?.execute()
    }
}