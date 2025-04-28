package adapter.display

fun main() {
    val usb = USB()
    val hdmi = HDMI()
    val vga = VGA()

    var adapters = mutableListOf<DisplayAdapter>()
    adapters.add(USBAdapter(usb, "Video Data"))
    adapters.add(HDMIAdapter(hdmi, 1080))
    adapters.add(VGAAdapter(vga, true))

    for(adapter in adapters) {
        adapter.display()
    }
}