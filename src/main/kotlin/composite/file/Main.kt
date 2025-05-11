package composite.file

fun main() {
    val file1 = File("Document.txt", 100)
    val file2 = File("Image.jpg", 200)

    val subDir = Directory("SubFolder")
    subDir.add(File("SubFile.txt", 50))

    val rootDir = Directory("RootFolder")
    rootDir.add(file1)
    rootDir.add(file2)
    rootDir.add(subDir)

    println("Initial structure:")
    rootDir.printName()

    println("Total size: ${rootDir.getSize()}KB")

    println("\nRemoving Image.jpg:")
    rootDir.remove("Image.jpg")
    rootDir.printName()

    println("Total size: ${rootDir.getSize()}KB")

    println("\nRemoving SubFolder:")
    rootDir.remove(subDir)
    rootDir.printName()
    println("Total size: ${rootDir.getSize()}KB")
}