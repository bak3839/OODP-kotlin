package bridge

class TV: Device {
    private var on: Boolean = false
    private var volume: Int = 30

    override fun turnOn() {
        on = true
        println("TV is now ON.")
    }

    override fun turnOff() {
        on = false
        println("TV is now OFF.")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("TV volume set to $volume")
    }

    override fun isEnabled(): Boolean {
        return on
    }
}

class Radio: Device {
    private var on: Boolean = false
    private var volume: Int = 30

    override fun turnOn() {
        on = true
        println("Radio is now ON.")
    }

    override fun turnOff() {
        on = false
        println("Radio is now OFF.")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("Radio volume set to $volume")
    }

    override fun isEnabled(): Boolean {
        return on
    }
}