package proxy.image

fun main() {
    val image = ProxyImage("test_image.jpg")

    println("File Name: ${image.getFileName()}")
    println("File Extension: ${image.getFileExtension()}")

    image.display()
    image.display()
}