package adapter.display

class USBAdapter(
    private val usb: USB,
    private val data: String
) : DisplayAdapter {
    override fun display() {
        usb.connectWithUsbCable(data)
    }
}

class HDMIAdapter(
    private val hdmi: HDMI,
    private val resolution: Int
): DisplayAdapter {
    override fun display() {
        hdmi.connectWithHdmiCable(resolution)
    }
}

class VGAAdapter(
    private val vga: VGA,
    private val highQuality: Boolean
): DisplayAdapter {
    override fun display() {
        vga.connectWithVGACable(highQuality)
    }
}
