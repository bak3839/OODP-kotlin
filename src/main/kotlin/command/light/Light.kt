package command.light

// 명령을 받을 리시버 클래스
// 리시버에게 내릴 명령들을 클래스로 만들 예정
class Light {
    fun turnOn() {
        println("Light is ON")
    }

    fun turnOff() {
        println("Light is OFF")
    }
}