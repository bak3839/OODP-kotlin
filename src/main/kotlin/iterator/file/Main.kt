package iterator.file

fun main() {
    val root = Directory("root")
    val home = Directory("home")
    val user = Directory("user")
    val file1 = File("file1.txt")
    val file2 = File("file2.txt")
    val file3 = File("file3.txt")

    root.add(home)
    home.add(user)
    user.add(file1)
    user.add(file2)
    home.add(file3)

    val fileSystem = FileSystem(root)

    println("Depth-First Traversal:")
    val depthIterator = fileSystem.depthFirstIterator()
    while (depthIterator.hasNext()) {
        println(depthIterator.next().getFileName())
    }

    println("\nBreadth-First Traversal:")
    val breadthIterator = fileSystem.breadthFirstIterator()
    while (breadthIterator.hasNext()) {
        println(breadthIterator.next().getFileName())
    }
}