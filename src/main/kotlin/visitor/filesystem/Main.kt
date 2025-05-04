package visitor.filesystem

fun main() {
    val file1 = File("file1.txt", 100)
    val file2 = File("file2.txt", 200)
    val file3 = File("file3.txt", 300)

    val directory1 = Directory("Folder1")
    directory1.addElement(file1)
    directory1.addElement(file2)

    val directory2 = Directory("Folder2")
    directory2.addElement(file3)

    val rootDirectory = Directory("Root")
    rootDirectory.addElement(directory1)
    rootDirectory.addElement(directory2)

    val sizeVisitor = SizeCalculatorVisitor()
    rootDirectory.accept(sizeVisitor)
    println("Total size of file system: ${sizeVisitor.getTotalSize()} bytes")

    val searchVisitor = FileSearchVisitor("file3.txt")
    rootDirectory.accept(searchVisitor)

    val foundFile = searchVisitor.getFoundFile()
    if(foundFile != null) {
        println("File found ${foundFile.getName()}, Size: ${foundFile.getSize()} bytes")
    } else {
        println("File not found")
    }
}