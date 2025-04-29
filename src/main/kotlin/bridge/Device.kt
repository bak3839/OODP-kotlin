package bridge

interface Device {
    fun turnOn()
    fun turnOff()
    fun setVolume(volume: Int)
    fun isEnabled(): Boolean
}