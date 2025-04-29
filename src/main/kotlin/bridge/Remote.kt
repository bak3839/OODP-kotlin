package bridge

abstract class Remote(
    protected val device: Device
) {
    abstract fun power()

    fun volumeUp() {
        device.setVolume(if(device.isEnabled()) 1 else 0)
    }

    fun volumeDown() {
        device.setVolume(if(device.isEnabled()) -1 else 0)
    }
}

class BasicRemote(
    device: Device,
): Remote(device) {
    override fun power() {
        when(device.isEnabled()) {
            true -> device.turnOff()
            false -> device.turnOn()
        }
    }
}

class AdvancedRemote(
    device: Device,
): Remote(device) {
    override fun power() {
        when(device.isEnabled()) {
            true -> device.turnOff()
            false -> device.turnOn()
        }
    }

    fun mute() {
        device.setVolume(0)
        println("Device is muted.")
    }
}