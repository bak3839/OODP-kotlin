package adapter.display

class USB {
    fun connectWithUsbCable(data: String) {
        println("Displaying via USB with data: $data")
    }
}

class HDMI {
    fun connectWithHdmiCable(resolution: Int) {
        println("Displaying via HDMI with resolution: $resolution")
    }
}

class VGA {
    fun connectWithVGACable(highQuality: Boolean) {
        println("Displaying via VGA with high quality: $highQuality")
    }
}