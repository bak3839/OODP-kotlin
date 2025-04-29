package bridge

fun main() {
    val tv = TV()
    val basicRemote = BasicRemote(tv)
    basicRemote.power()
    basicRemote.volumeUp()

    val radio = Radio()
    val advancedRemote = AdvancedRemote(radio)
    advancedRemote.power()
    advancedRemote.mute()
}